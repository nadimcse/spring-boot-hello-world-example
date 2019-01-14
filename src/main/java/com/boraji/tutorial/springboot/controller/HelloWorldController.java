package com.boraji.tutorial.springboot.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @RequestMapping("/")
   public String sayHello() {

      System.out.println("Hello" + UUID.randomUUID().toString());

      return "Hello Spring Boot again!!";
   }
}
