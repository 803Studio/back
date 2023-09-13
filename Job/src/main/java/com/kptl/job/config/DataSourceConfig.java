package com.kptl.job.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.sql.DataSource;

import com.alibaba.fastjson.JSON;
import com.kptl.job.dto.KeyDTO;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
//    private static final String MYSQL_PATH = "/usr/local/kptl/mysql.json";
    private static final String MYSQL_PATH = "B:\\test.json";
    private KeyDTO keyDTO;
    @Bean
    public DataSource dataSource() {
        try {
            File file = new File(MYSQL_PATH);
            InputStream inputStream = new FileInputStream(file);
            keyDTO = JSON.parseObject(inputStream, KeyDTO.class);
            System.out.println(keyDTO.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        properties.setProperty("user", keyDTO.getUser());
        properties.setProperty("password", keyDTO.getPassword());
        dataSource.setDriverClassName(keyDTO.getDriver());
        dataSource.setUrl(keyDTO.getUrl());
        dataSource.setConnectionProperties(properties);

        return dataSource;
    }
}
