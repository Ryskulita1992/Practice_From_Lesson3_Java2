package com.company;

import java.util.Scanner;

public class User {
    String Name;
    int age;

    public String getName() {
        return Name;
    }

    public void setName() throws IllegalNameLengthException {
        System.out.println( "Enter your name");
        Scanner sc= new Scanner(System.in) ;
        String name=sc.nextLine();
        if (name.length()>20){
            throw new IllegalAgeException("The name symbols was given is too long ");

    }
        this.Name=name;}


    public int getAge() {
        return age;
    }

    public void setAge() {
        System.out.println( "Enter your age");
        Scanner sc= new Scanner(System.in) ;
        int age =sc.nextInt();
        if (age>100||age <0){
            throw new IllegalAgeException("The age infowas given is incorrect");
        }
        this.age = age;
    }
}

;