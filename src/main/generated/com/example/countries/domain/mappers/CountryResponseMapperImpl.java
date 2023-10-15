package com.example.countries.domain.mappers;

import com.example.countries.adapter.dto.CountryName;
import com.example.countries.adapter.dto.CountryResponse;
import com.example.countries.domain.dto.Country;
import com.example.countries.domain.dto.Currencies;
import com.example.countries.domain.dto.Currency;
import com.example.countries.domain.dto.LocalLanguage;
import com.example.countries.domain.dto.Name;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-15T13:25:49-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Eclipse Adoptium)"
)
public class CountryResponseMapperImpl extends CountryResponseMapper {

    @Override
    public CountryResponse toCountryResponse(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryResponse.CountryResponseBuilder countryResponse = CountryResponse.builder();

        countryResponse.name( nameToCountryName( country.getName() ) );
        countryResponse.currencies( countryCurrenciesCurrencyName( country ) );
        List<String> list = country.getCapital();
        if ( list != null ) {
            countryResponse.capital( new ArrayList<String>( list ) );
        }
        countryResponse.population( country.getPopulation() );
        List<String> list1 = country.getTimezones();
        if ( list1 != null ) {
            countryResponse.timezones( new ArrayList<String>( list1 ) );
        }
        countryResponse.cca2( country.getCca2() );
        countryResponse.cca3( country.getCca3() );
        countryResponse.region( country.getRegion() );
        countryResponse.subregion( country.getSubregion() );
        Map<String, String> map = country.getLanguages();
        if ( map != null ) {
            countryResponse.languages( new LinkedHashMap<String, String>( map ) );
        }

        return countryResponse.build();
    }

    @Override
    public List<CountryResponse> toCountryListResponse(List<Country> countryList) {
        if ( countryList == null ) {
            return null;
        }

        List<CountryResponse> list = new ArrayList<CountryResponse>( countryList.size() );
        for ( Country country : countryList ) {
            list.add( toCountryResponse( country ) );
        }

        return list;
    }

    protected CountryName nameToCountryName(Name name) {
        if ( name == null ) {
            return null;
        }

        CountryName.CountryNameBuilder countryName = CountryName.builder();

        countryName.common( name.getCommon() );
        countryName.official( name.getOfficial() );
        Map<String, LocalLanguage> map = name.getNativeName();
        if ( map != null ) {
            countryName.nativeName( new LinkedHashMap<String, LocalLanguage>( map ) );
        }

        return countryName.build();
    }

    private String countryCurrenciesCurrencyName(Country country) {
        if ( country == null ) {
            return null;
        }
        Currencies currencies = country.getCurrencies();
        if ( currencies == null ) {
            return null;
        }
        Currency currency = currencies.getCurrency();
        if ( currency == null ) {
            return null;
        }
        String name = currency.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
