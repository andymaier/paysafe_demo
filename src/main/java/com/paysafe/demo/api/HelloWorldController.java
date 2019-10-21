package com.paysafe.demo.api;

import com.paysafe.demo.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  @Autowired
  Greeter greeter;

  @GetMapping
  public String hello() {
    return greeter.getGreeting();
  }
}
