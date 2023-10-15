package com.example.countries.adapter.out.client;

import com.example.countries.adapter.config.WebClientHttpInterface;
import com.example.countries.domain.dto.Country;
import com.example.countries.domain.out.CountryService;

import java.util.List;

public class AdapterCountryApiService implements CountryService {

   private WebClientHttpInterface webCLient;

    public AdapterCountryApiService(WebClientHttpInterface webCLient) {
        this.webCLient = webCLient;
    }

    @Override
    public List<Country> getCountryByName(String countryName) {

        return webCLient.proxyFactory().createClient(CountryWebClientService.class).getCountryByName(countryName);

    }
}
