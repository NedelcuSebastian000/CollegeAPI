package com.example.demo.rest;

public class GeneralNotFoundException extends RuntimeException{
    public GeneralNotFoundException(String message) {
        super(message);
    }

    public GeneralNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeneralNotFoundException(Throwable cause) {
        super(cause);
    }
}