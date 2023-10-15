package com.example.countries.adapter.out.client;

import com.example.countries.domain.dto.Country;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface CountryWebClientService {

    @GetExchange("/name/{nameCountry}")
    List<Country> getCountryByName(@PathVariable("nameCountry") String nameCountry);

}