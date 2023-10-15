package com.example.countries.domain.useCase;

@FunctionalInterface
public interface UseCase<T, R> {

    R execute(T comando);

}