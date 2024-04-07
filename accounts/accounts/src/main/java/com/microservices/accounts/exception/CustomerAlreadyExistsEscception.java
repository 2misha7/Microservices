package com.microservices.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsEscception extends RuntimeException{
    public CustomerAlreadyExistsEscception(String message){
        super(message);
    }
}
