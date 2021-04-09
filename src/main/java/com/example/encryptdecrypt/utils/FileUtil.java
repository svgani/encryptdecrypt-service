/*
 *  Copyright 2017-2020 NXP.
 *  NXP Confidential. This software is owned or controlled by NXP and may only be used strictly in accordance with the applicable license terms. By expressly accepting such terms or by downloading, installing, activating and/or otherwise using the software, you are agreeing that you have read, and that you agree to comply with and are bound by, such license terms. If you do not agree to be bound by the applicable license terms, then you may not retain, install, activate or otherwise use the software.
 */

package com.example.encryptdecrypt.utils;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.apache.commons.io.FileUtils;

/**
 * Utility component for file manipulation.
 */
@Component
@Slf4j
public class FileUtil {

  /**
   * Read file at path as base64 string.
   *
   * @param path path to file
   * @return base64 String
   * @throws IOException exception
   */
  public String readFileAsBase64(String path) throws IOException {
    String fileContent = null;
    File file = new File(path);
    if(file.exists()) {
      fileContent = Base64.getUrlEncoder().encodeToString(FileUtils.readFileToByteArray(file));;
    } else {
      log.warn("Could not load Certificate because file: {} does not exist.", path);
    }
    return fileContent;

  }

}
