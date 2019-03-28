package com.hlb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Fly on 2019/3/27.
 */
@EnableAutoConfiguration
@ComponentScan("com.hlb")
public class Sb01App {
    public static void main(String[] args) {
        SpringApplication.run(Sb01App.class,args);
    }
}