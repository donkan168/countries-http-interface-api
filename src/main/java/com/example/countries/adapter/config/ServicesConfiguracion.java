package com.example.countries.adapter.config;

import com.example.countries.adapter.out.client.AdapterCountryApiService;
import com.example.countries.domain.out.CountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguracion {

    @Bean
    public CountryService countryService(WebClientHttpInterface webCLient) {
        return new AdapterCountryApiService(webCLient);
    }

}
