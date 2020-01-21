package com.company;

public class FactorialException extends RuntimeException {
    int num;
    int getNum(){return num;}

    public FactorialException(String message, int num) {
        super(message);
        this.num = num;
    }

}

