package com.example.countries.adapter.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryResponse {

    private CountryName name;
    private String currencies;
    private String cca2;
    private String cca3;
    private List<String> capital;
    private String region;
    private String subregion;
    private Map<String,String> languages;
    private String flag;
    private String population;
    private List<String> timezones;
}
