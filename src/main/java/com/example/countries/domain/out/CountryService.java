package com.example.countries.domain.out;

import com.example.countries.domain.dto.Country;

import java.util.List;

public interface CountryService {

    List<Country> getCountryByName (String name);
}
