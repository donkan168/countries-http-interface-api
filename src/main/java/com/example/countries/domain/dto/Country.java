package com.example.countries.domain.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country implements Serializable {

    private final static long serialVersionUID = -2707036422682065475L;

    @JsonProperty("name")
    public Name name;
    @JsonProperty("tld")
    public List<String> tld;
    @JsonProperty("cca2")
    public String cca2;
    @JsonProperty("ccn3")
    public String ccn3;
    @JsonProperty("cca3")
    public String cca3;
    @JsonProperty("cioc")
    public String cioc;
    @JsonProperty("independent")
    public Boolean independent;
    @JsonProperty("status")
    public String status;
    @JsonProperty("unMember")
    public Boolean unMember;
    @JsonProperty("currencies")
    public Currencies currencies;
    @JsonProperty("region")
    public String region;
    @JsonProperty("subregion")
    public String subregion;
    @JsonProperty("population")
    public String population;
    @JsonProperty("capital")
    public List<String> capital;
    @JsonProperty("timezones")
    public List<String> timezones;

    @JsonProperty("languages")
    public Map<String,String> languages;

}