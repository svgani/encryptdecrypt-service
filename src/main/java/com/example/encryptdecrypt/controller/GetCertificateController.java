package com.example.encryptdecrypt.controller;

import com.example.encryptdecrypt.utils.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GetCertificateController {

  @Autowired
  private FileUtil fileUtil;

  @Value("${test.public.key}")
  private String certPath;

  @GetMapping(value = "/rest/getcertificates")
  public GetCertificateResponse getCertificates() {
    GetCertificateResponse getCertificateResponse = new GetCertificateResponse();
    GetCertificateData getCertificateData = new GetCertificateData();
    getCertificateData.setCertificateId("1234");
    getCertificateResponse.setCertificateData(getCertificateData);
    getCertificateResponse.setStatus("0000");
    getCertificateResponse.setStatusMessage("SUCCESS");
    try {
      getCertificateData.setCertificateData(fileUtil.readFileAsBase64(certPath));
      log.info("#reading cert content:" + getCertificateData.getCertificateData());
    } catch (Exception e) {
      log.error("#error occurred during cert reading");
    }
    return getCertificateResponse;
  }
}
