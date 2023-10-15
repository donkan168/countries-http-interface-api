package com.example.countries.domain.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Name implements Serializable {
    private final static long serialVersionUID = -2294606766439495923L;

    @JsonProperty("common")
    public String common;
    @JsonProperty("official")
    public String official;
    @JsonProperty("nativeName")
    public Map<String, LocalLanguage> nativeName;

}