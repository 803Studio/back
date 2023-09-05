package com.kptl.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.kptl.user.common.BaseResponse;
import com.kptl.user.dto.UserDTO;
import com.kptl.user.service.UserService;
import com.kptl.user.util.JWTUtils;
import com.kptl.user.util.ResultUtils;
import com.kptl.user.util.WeChatUtil;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Value("${vx.password}")
    private String passWd;

    @Value("${vx.id}")
    private String vxId;

    @Autowired
    UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;
    @GetMapping("/test")
    public String Test() {

        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        // 加密秘钥(盐)
        textEncryptor.setPassword("hehe1314");
        String encrypt = stringEncryptor.encrypt("123456");
        return encrypt;
    }

    @PostMapping("/login")
    public BaseResponse Login(@RequestBody String code) {
        Map<String,Object> map = new HashMap<>();
        try {
            // 1.接收小程序发送的code
            // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
            JSONObject SessionKeyOpenId = WeChatUtil.getSessionKeyOrOpenId(code, vxId, passWd);
            // 3.接收微信接口服务 获取返回的参数
            String openid = SessionKeyOpenId.getString("openid");
            openid = "123";
            String sessionKey = SessionKeyOpenId.getString("session_key");
            UserDTO user = userService.findUser(openid);
            if (user == null && openid != null) {
                // 用户信息入库
                user = new UserDTO();
                user.setId(openid);
                userService.save(user);
            }
            Map<String,String> payload = new HashMap<>();
            payload.put("id",openid);
            //生成JWt的令牌
            String token = JWTUtils.getToken(payload);
            map.put("state",true);
            map.put("msg","认证成功");
            map.put("token",token);
        } catch (Exception e) {
            map.put("status",false);
            map.put("msg",e.getMessage());
        }
        return ResultUtils.success(map);
    }
}
