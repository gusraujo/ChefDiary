package com.codenough.chefsdiary;

import org.springframework.boot.SpringApplication;

public class TestChefsDiaryApplication {

    public static void main(String[] args) {
        SpringApplication.from(ChefsDiaryApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
