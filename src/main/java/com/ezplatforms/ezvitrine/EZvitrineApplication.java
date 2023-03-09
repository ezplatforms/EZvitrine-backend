package com.ezplatforms.ezvitrine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EZvitrineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EZvitrineApplication.class, args);
    }

}
