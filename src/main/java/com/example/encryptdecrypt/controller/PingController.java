package com.example.encryptdecrypt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingController {

  @GetMapping(value = "/rest/ping")
  public String ping() {
    log.info("#called ping service...");
    return "pong";
  }

}
