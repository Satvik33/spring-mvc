package com.stackroute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"main.java.controller","main.java.model"})
public class AppConfig {
}
