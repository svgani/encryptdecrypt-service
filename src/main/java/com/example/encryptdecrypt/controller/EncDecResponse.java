package com.example.encryptdecrypt.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncDecResponse {

  private String status;
  private String statusMessage;
  private EncDecData encDecData;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public EncDecData getEncDecData() {
    return encDecData;
  }

  public void setEncDecData(EncDecData encDecData) {
    this.encDecData = encDecData;
  }

  @Override
  public String toString() {
    return "EncDecResponse{" +
      "status='" + status + '\'' +
      ", statusMessage='" + statusMessage + '\'' +
      ", encDecData=" + encDecData +
      '}';
  }
}
