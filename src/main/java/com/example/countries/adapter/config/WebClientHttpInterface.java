package com.example.countries.adapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientHttpInterface {

  @Bean
  public HttpServiceProxyFactory proxyFactory() {
    HttpServiceProxyFactory httpServiceProxyFactory =
        HttpServiceProxyFactory.builder(
                WebClientAdapter.forClient(
                        WebClient.builder()
                        .baseUrl("https://restcountries.com/v3.1")
                        .build())).build();
    return httpServiceProxyFactory;
  }


}