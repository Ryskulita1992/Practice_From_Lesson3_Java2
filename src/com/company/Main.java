package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.naming.Name;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user=new User ();


        for (int i = 0;  ; i++) {
            try {
                user.setName();
                user.setAge();
            } catch (IllegalAgeException age){
            age.printStackTrace();

            }
            catch (IllegalNameLengthException in){
                System.out.println(in.getMessage());

            }




        }








    }



}
