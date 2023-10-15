package com.example.countries.domain.configuration;

import com.example.countries.domain.out.CountryService;
import com.example.countries.domain.useCase.GetCountryInfoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CasoUsoConfiguracion {

    @Bean
    public GetCountryInfoUseCase getCountryInfoUseCase(CountryService countryService) {
        return new GetCountryInfoUseCase(countryService);
    }
}
