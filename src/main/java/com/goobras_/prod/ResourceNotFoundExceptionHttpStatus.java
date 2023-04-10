package com.goobras_.prod;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionHttpStatus extends RuntimeException {
    
    public ResourceNotFoundExceptionHttpStatus(String message) {
        super(message);
    }
    
    public ResourceNotFoundExceptionHttpStatus(String message, Throwable cause) {
        super(message, cause);
    }
}