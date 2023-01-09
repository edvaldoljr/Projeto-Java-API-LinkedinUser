package com.linkedin.api.apilinkedin.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
        super(s);
    }

    public UserNotFoundException(String s, Throwable error) {
        super(s, error);
    }
}
