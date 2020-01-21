package com.company;

import org.w3c.dom.ls.LSOutput;

public class WithoutExHandling {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[3]/0);

        System.out.println(arr[4]);
        System.out.println(arr[5]);


    }
}
