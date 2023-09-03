package com.kptl.user.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

public class WeChatUtil {
    @Value("${vx.password}")
    private static String passWd;

    @Value("${vx.id}")
    private static String vxId;

    @Value("${vx.url}")
    private static String vxUrl;

    public static JSONObject getSessionKeyOrOpenId(String code) {
        Map<String, String> requestUrlParam = new HashMap<>();
        //小程序appId
        requestUrlParam.put("appid", vxId);
        //小程序secret
        requestUrlParam.put("secret", passWd);
        //小程序端返回的code
        requestUrlParam.put("js_code", code);
        //默认参数
        requestUrlParam.put("grant_type", "authorization_code");
        //发送post请求读取调用微信接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject(HttpClientUtil.doPost(vxUrl, requestUrlParam));
        return jsonObject;
    }
}
