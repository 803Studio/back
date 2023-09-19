//package com.kptl.job.config;
//
//import com.alibaba.fastjson.JSON;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Map;
//
//public class RedisConfig {
//    public static void main(String[] args) {
//        // 读取JSON文件中的Redis配置信息
//        String jsonFilePath = "path/to/redis-config.json"; // 替换为您的JSON文件路径
//        Map<String, Object> redisConfig;
//        try {
//            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
//            redisConfig = JSON.parseObject(jsonContent, Map.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
//
//        // 设置系统属性
//        System.setProperty("spring.redis.host", (String) redisConfig.get("host"));
//        System.setProperty("spring.redis.port", (String) redisConfig.get("port"));
//        System.setProperty("spring.redis.password", (String) redisConfig.get("password"));
//    }
//}