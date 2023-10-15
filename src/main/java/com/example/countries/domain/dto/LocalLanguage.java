package com.example.countries.domain.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalLanguage implements Serializable {

    private final static long serialVersionUID = 7449099588269110592L;

    @JsonProperty("official")
    public String official;
    @JsonProperty("common")
    public String common;

}