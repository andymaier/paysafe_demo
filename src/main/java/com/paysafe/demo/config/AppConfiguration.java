package com.paysafe.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

  @Bean("myname")
  public String myname() {
    return "Paysafe";
  }
}
