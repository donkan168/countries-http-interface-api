package com.example.countries.domain.mappers;

import com.example.countries.adapter.dto.CountryResponse;
import com.example.countries.domain.dto.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CountryResponseMapper {

    public static CountryResponseMapper INSTANCE = Mappers.getMapper(CountryResponseMapper.class);

    @Mappings({
            @Mapping(source = "country.name.common", target = "name.common"),
            @Mapping(source = "country.name.official", target = "name.official"),
            @Mapping(source = "country.name.nativeName", target = "name.nativeName"),
            @Mapping(source = "currencies.currency.name", target = "currencies"),
            @Mapping(source = "country.capital", target = "capital"),
            @Mapping(source = "country.population", target = "population"),
            @Mapping(source = "country.timezones", target = "timezones"),
    })
    public abstract CountryResponse toCountryResponse(Country country);

    public abstract List<CountryResponse> toCountryListResponse(List<Country> countryList);

}
