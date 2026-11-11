package com.store.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        System.setProperty("user.timezone", "Asia/Kolkata");
        SpringApplication.run(UserApplication.class, args);
    }

}
