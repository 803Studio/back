//package com.kptl.job.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//@Configuration
//public class RedisConfig {
//
//    @Value("${spring.redis.password}")
//    private String redisPassword;
//
//    private static final String REDIS_PATH = "B:\\redis.json";
////    private static final String REDIS_PATH = "/usr/local/kptl/redis.json";
//
//    @Bean
//    public String getRedisPassword() throws IOException {
//
//        String redisPasswordFromFile = new ObjectMapper().readValue(Files.newInputStream(Paths.get("path/to/external-config.json")), String.class);
//        return redisPasswordFromFile;
//    }
//}