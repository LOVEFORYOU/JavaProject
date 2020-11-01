package com.lsl.sbdemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标注一个主程序类，说明这是一个springboot应用
 */
@SpringBootApplication
public class Sbdemo01Application {

    public static void main(String[] args) {
        // 启动Spring应用
        SpringApplication.run(Sbdemo01Application.class, args);
    }

}
