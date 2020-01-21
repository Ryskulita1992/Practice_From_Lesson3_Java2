package com.company;

public class ThrowsExample {
    public static int getFactorial(int num) throws FactorialException {
        int result = -1;
        if (num < 0) {
            throw new FactorialException("Your num is <0", num);

        }
        for (int i = 1; i<= num ; i++) {
            result*=i;
        }
        return result;

        }

    public static void main(String[] args) {
        System.out.println("Factorial:" + getFactorial(-5));
        try {
            System.out.println ("Factorial:" + getFactorial(5));
        }
        catch (FactorialException FE){
            System.out.println(FE.getMessage());

        }




    }
}



