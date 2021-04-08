package com.example.encryptdecrypt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @GetMapping(value = "/rest/ping")
  public String ping() {
    return "pong";
  }

}
