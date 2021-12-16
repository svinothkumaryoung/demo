package com.agreeyaBasicsSpringboot.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID=11;
    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}
