package com.example.countries.adapter.dto;

import com.example.countries.domain.dto.LocalLanguage;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryName {

    private String common;
    private String official;
    private Map<String, LocalLanguage> nativeName;
}
