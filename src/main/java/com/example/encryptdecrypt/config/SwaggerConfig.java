/*
 * Copyright 2018-2020 NXP.
 *
 * NXP Confidential. This software is owned or controlled by NXP and may only be used strictly in accordance with the applicable license
 * terms.  By expressly accepting such terms or by downloading, installing, activating and/or otherwise using the software, you are agreeing
 *  that you have read, and that you agree to comply with and are bound by, such license terms.  If you do not agree to be bound by the
 * applicable license terms, then you may not retain, install, activate or otherwise use the software.
 *
 */
package com.example.encryptdecrypt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  // =================================================
  // Instance Variables
  // =================================================

//  @Value("${server.servlet.contextPath}")
//  private String contextPath;

  // =================================================
  // Implementations
  // =================================================

  /**
   * Default method implementation.
   * 
   * @return  Docket
   */
  @Bean
  public Docket apiDocket() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
      .select()
      .paths(regex("^(/rest/).*$"))
      .build();
  }

  /**
   * Default method implementation.
   * 
   * @return ApiInfo for Swagger
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
      .title("encryptdecrypt-service")
      .description("encryptdecrypt-service")
      .contact(new Contact("Test", "Test.COM", "developer@test.com"))
      .version("0.0.1-SNAPSHOT").build();
  }

}
