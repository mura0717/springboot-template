package com.example.springboottemplate;

import com.example.springboottemplate.ConsoleIO.ConsoleApiInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTemplateApplication.class, args);
        ConsoleApiInfo.print();
    }

}
