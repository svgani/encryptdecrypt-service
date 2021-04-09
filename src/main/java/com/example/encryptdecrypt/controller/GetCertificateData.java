package com.example.encryptdecrypt.controller;

public class GetCertificateData {

  public String certificateId;
  public String certificateData;

  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public String getCertificateData() {
    return certificateData;
  }

  public void setCertificateData(String certificateData) {
    this.certificateData = certificateData;
  }

  @Override
  public String toString() {
    return "GetCertificateData{" +
      "certificateId='" + certificateId + '\'' +
      ", certificateData='" + certificateData + '\'' +
      '}';
  }
}
