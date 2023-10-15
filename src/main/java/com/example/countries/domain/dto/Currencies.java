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
public class Currencies implements Serializable {

    private final static long serialVersionUID = 479244277616851658L;

    public Currency currency;

}