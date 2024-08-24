package com.codenough.chefsdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ChefsDiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChefsDiaryApplication.class, args);
    }

}
