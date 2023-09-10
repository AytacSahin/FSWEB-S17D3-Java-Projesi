package com.workintech.zoo.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

// Animal exception'larını yakalayacak sınıfımız:
@Getter
@Setter
public class AnimalException extends RuntimeException {
    private HttpStatus status;

    public AnimalException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
