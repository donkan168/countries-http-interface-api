package com.example.countries.adapter.in;

import com.example.countries.domain.useCase.GetCountryInfoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/country")
public class CountriesController {


    private final GetCountryInfoUseCase countryInfoUseCase;

    public CountriesController(GetCountryInfoUseCase countryInfoUseCase) {
        this.countryInfoUseCase = countryInfoUseCase;
    }

    @GetMapping("/{countryName}")
    public ResponseEntity getCountryInfo (@PathVariable("countryName") @NonNull String countryName){
        return ResponseEntity.ok(countryInfoUseCase.execute(countryName));
    }
}
