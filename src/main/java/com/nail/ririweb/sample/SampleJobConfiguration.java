package com.nail.ririweb.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleJobConfiguration {
    @Bean
    public void print() {
        System.out.println("잡테스트입니다.");
    }
}
