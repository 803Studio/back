package com.kptl.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.kptl.user.dto.UserDTO;
import com.kptl.user.service.UserService;
import com.kptl.user.util.WeChatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public JSONObject Login(@RequestParam(value = "code", required = false) String code) {
        // 1.接收小程序发送的code
        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WeChatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数
        String openid = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");
        UserDTO user = userService.findUser(openid);
        if (user == null) {
            // 用户信息入库
            user = new UserDTO();
            user.setId(openid);
            userService.save(user);
        }
        return SessionKeyOpenId;
    }
}
