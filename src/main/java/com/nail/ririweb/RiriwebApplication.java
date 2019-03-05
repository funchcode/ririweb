package com.nail.ririweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // = @Configuration + @EnableAutoConfiguration + @ComponentScan
public class RiriwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RiriwebApplication.class, args);
    }

}
