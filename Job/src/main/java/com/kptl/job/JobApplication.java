package com.kptl.job;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@SpringBootApplication
public class JobApplication {
    private static final String REDIS_PATH_LOCAL = "E:\\Code\\KPTL\\config\\redis.json";

    public static void main(String[] args) {
        Map<String, Object> redisConfig;
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(REDIS_PATH_LOCAL)));
            redisConfig = JSON.parseObject(jsonContent, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 设置系统属性
        System.setProperty("spring.redis.host", (String) redisConfig.get("host"));
        System.setProperty("spring.redis.port", (String) redisConfig.get("port"));
        System.setProperty("spring.redis.password", (String) redisConfig.get("password"));
        SpringApplication.run(JobApplication.class, args);
    }

}
