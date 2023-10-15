package com.example.countries.domain.useCase;

import com.example.countries.adapter.dto.CountryGeneralInfoResponse;
import com.example.countries.adapter.dto.CountryResponse;
import com.example.countries.domain.dto.Country;
import com.example.countries.domain.mappers.CountryResponseMapper;
import com.example.countries.domain.out.CountryService;

import java.util.List;


public class GetCountryInfoUseCase implements UseCase<String, CountryGeneralInfoResponse> {

    private static final String CODE_ENTITY_NOT_FOUND = "1404";
    private final CountryService countryService;

    public GetCountryInfoUseCase(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public CountryGeneralInfoResponse execute(String countryName) {

        List<Country> countryFound = countryService.getCountryByName(countryName);
        List<CountryResponse> responseList = CountryResponseMapper.INSTANCE.toCountryListResponse(countryFound);
        return CountryGeneralInfoResponse.builder().country(responseList).build();
    }
}
