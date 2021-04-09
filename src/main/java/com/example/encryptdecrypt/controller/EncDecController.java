package com.example.encryptdecrypt.controller;

import com.example.encryptdecrypt.utils.EncryptDecryptUtil;
import java.security.PrivateKey;
import java.security.PublicKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EncDecController {

  @Value("${test.public.key}")
  private String publicKeyFilePath;

  @Value("${test.private.key}")
  private String privateKeyFilePath;

  @PostMapping(value="/rest/encryptdata", consumes = "application/json", produces = "application/json")
  public EncDecResponse encryptData(@RequestBody EncDecRequest encDecRequest) {
    EncDecResponse encDecResponse = new EncDecResponse();
    log.info("#called encryptData with encDecRequest: "+encDecRequest);
    EncDecData encDecData = new EncDecData();
//    encDecData.setData(encDecRequest.getData());
    encDecData.setCertificateId(encDecRequest.getCertificateId());
    encDecResponse.setStatus("0000");
    encDecResponse.setStatusMessage("SUCCESS");
    encDecResponse.setEncDecData(encDecData);
    log.info("#encryptdata response:"+encDecResponse);
    return getEncDecResponse(encDecRequest, encDecResponse, encDecData, true);
  }

  @PostMapping(value="/rest/decryptdata", consumes = "application/json", produces = "application/json")
  public EncDecResponse decryptData(@RequestBody EncDecRequest encDecRequest) {
    EncDecResponse encDecResponse = new EncDecResponse();
    log.info("#called decryptData with encDecRequest: "+encDecRequest);
    EncDecData encDecData = new EncDecData();
    encDecData.setData(encDecRequest.getData());
    encDecData.setCertificateId(encDecRequest.getCertificateId());
    encDecResponse.setStatus("0000");
    encDecResponse.setStatusMessage("SUCCESS");
    encDecResponse.setEncDecData(encDecData);
    log.info("#decryptdata response:"+encDecResponse);
    return getEncDecResponse(encDecRequest, encDecResponse, encDecData, false);
  }

  private EncDecResponse getEncDecResponse(@RequestBody EncDecRequest encDecRequest, EncDecResponse encDecResponse,
    EncDecData encDecData, boolean isEncrypt) {
    try {
      PrivateKey privateKey = EncryptDecryptUtil.getPrivateKey(privateKeyFilePath);
//      log.info(rsaPrivateKey.toString());
      PublicKey publicKey = EncryptDecryptUtil.getPublicKey(publicKeyFilePath);
//      log.info(rsaPublicKey.toString());
      if(isEncrypt) {
        String encryptedData = EncryptDecryptUtil.encrypt(encDecRequest.getData(), publicKey);
        log.info("#encryptedData:" + encryptedData);
        encDecData.setData(encryptedData);
      }else {
        String decryptedData = EncryptDecryptUtil.decrypt(encDecRequest.getData(), privateKey);
        log.info("#decryptedData:" + decryptedData);
        encDecData.setData(decryptedData);
      }
    }catch (Exception e) {
      log.error("#Error occurred during private/public key reading...");
    }
    return encDecResponse;
  }

}
