package com.sebastian;

;

public class EmptyStackException extends RuntimeException {

    public EmptyStackException(String err) {
        super(err);
    }// EmptyStackException()

    //////////////////////////////////////////////////////////////////////

    public EmptyStackException() {
        super();
    }// EmptyStackException()
}// class