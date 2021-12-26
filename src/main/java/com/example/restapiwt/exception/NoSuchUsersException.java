package com.example.restapiwt.exception;

public class NoSuchUsersException extends RuntimeException {
    public NoSuchUsersException(String message) {
        super(message);
    }
}
