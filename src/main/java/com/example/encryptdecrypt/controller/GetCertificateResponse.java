package com.example.encryptdecrypt.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCertificateResponse {

  private String status;
  private String statusMessage;
  private GetCertificateData certificateData;

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

  public GetCertificateData getCertificateData() {
    return certificateData;
  }

  public void setCertificateData(GetCertificateData certificateData) {
    this.certificateData = certificateData;
  }

  @Override
  public String toString() {
    return "GetCertificateResponse{" +
      "status='" + status + '\'' +
      ", statusMessage='" + statusMessage + '\'' +
      ", certificateData=" + certificateData +
      '}';
  }
}
