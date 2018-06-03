package com.ddemott.webappspringsecurityboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ddemott.webappspringsecurityboot") // Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute
public class InMemorySecurityApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(InMemorySecurityApplication.class, args);            // it wil start application
    }
}
