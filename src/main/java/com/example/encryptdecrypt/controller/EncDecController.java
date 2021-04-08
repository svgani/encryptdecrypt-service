package com.example.encryptdecrypt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncDecController {

  private static final Logger LOGGER = LoggerFactory.getLogger(EncDecController.class);

  @PostMapping(value="/rest/encryptdata", consumes = "application/json", produces = "application/json")
  public EncDecResponse encryptData(@RequestBody EncDecRequest encDecRequest) {
    EncDecResponse encDecResponse = new EncDecResponse();
    LOGGER.info("#called encryptData with encDecRequest: "+encDecRequest);
    EncDecData encDecData = new EncDecData();
    encDecData.setData(encDecRequest.getData());
    encDecData.setCertificateId(encDecRequest.getCertificateId());
    encDecResponse.setStatus("0000");
    encDecResponse.setStatusMessage("SUCCESS");
    encDecResponse.setEncDecData(encDecData);
    LOGGER.info("#encryptdata response:"+encDecResponse);
    return encDecResponse;
  }

  @PostMapping(value="/rest/decryptdata", consumes = "application/json", produces = "application/json")
  public EncDecResponse decryptData(@RequestBody EncDecRequest encDecRequest) {
    EncDecResponse encDecResponse = new EncDecResponse();
    LOGGER.info("#called decryptData with encDecRequest: "+encDecRequest);
    EncDecData encDecData = new EncDecData();
    encDecData.setData(encDecRequest.getData());
    encDecData.setCertificateId(encDecRequest.getCertificateId());
    encDecResponse.setStatus("0000");
    encDecResponse.setStatusMessage("SUCCESS");
    encDecResponse.setEncDecData(encDecData);
    LOGGER.info("#decryptdata response:"+encDecResponse);
    return encDecResponse;
  }

}
