package com.example.encryptdecrypt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCertificateController {

  @GetMapping(value = "/rest/getcertificates")
  public GetCertificateResponse getCertificates() {
    GetCertificateResponse getCertificateResponse = new GetCertificateResponse();
    GetCertificateData getCertificateData = new GetCertificateData();
    getCertificateData.setCertificateId("1234");
    getCertificateData.setCertificateData("data:data");
    getCertificateResponse.setCertificateData(getCertificateData);
    getCertificateResponse.setStatus("0000");
    getCertificateResponse.setStatusMessage("SUCCESS");
    return getCertificateResponse;
  }
}
