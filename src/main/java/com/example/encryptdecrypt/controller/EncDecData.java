package com.example.encryptdecrypt.controller;

public class EncDecData {

  public String certificateId;
  public String data;

  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "EncDecData{" +
      "certificateId='" + certificateId + '\'' +
      ", data='" + data + '\'' +
      '}';
  }
}
