package com.company;

public class WithExHandling {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[12]);
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetical mistake");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        catch (ArrayIndexOutOfBoundsException AIOBE){
            System.out.println("AIOBE.getMessage");
            System.out.println("u re out of bounds");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
