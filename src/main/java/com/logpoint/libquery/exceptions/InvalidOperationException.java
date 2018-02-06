package com.logpoint.libquery.exceptions;

public class InvalidOperationException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidOperationException(String error) {
        super(error);
    }
}
