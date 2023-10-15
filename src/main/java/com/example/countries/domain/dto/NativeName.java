package com.example.countries.domain.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NativeName implements Serializable {

    private final static long serialVersionUID = -2483394995653326710L;
    @JsonProperty("spa")
    public LocalLanguage spa;

}