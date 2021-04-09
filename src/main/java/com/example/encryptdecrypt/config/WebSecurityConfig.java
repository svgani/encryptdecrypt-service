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

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  // =================================================
  // Implementations
  // =================================================
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests().anyRequest().permitAll();
  }

}
