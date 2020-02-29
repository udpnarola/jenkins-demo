package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

  @GetMapping("/one")
  public String testOne(){
    return "Hello I'm Jenkins Test One";
  }

  /*@GetMapping("/two")
  public String testTwo(){
    return "Hello I'm Jenkins Test Two";
  }*/

}
