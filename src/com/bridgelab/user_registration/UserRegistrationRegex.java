package com.bridgelab.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// UC2-Method for validation of last name.
public class UserRegistrationRegex {

    public static void firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(firstName);
        if (match.matches()) {
            System.out.println(firstName + " : is a valid first name ");
        } else {
            System.out.println(firstName + " : is a invalid first name ");
        }
    }
    public static void lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(lastName);
        if (match.matches()) {
            System.out.println(lastName + " : is a valid last name ");
        } else {
            System.out.println(lastName + " : is a invalid last name ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome in User registration program using Regex");
        Scanner sc = new Scanner(System.in);
        System.out.println("What do want enter \n1. First Name \n2. Last Name");
        int option = sc.nextInt();
        switch(option) {

            case 1:
                System.out.println("Enter First Name");
                String firstName = sc.next();
                firstName(firstName);
                break;

            case 2:
                System.out.println("Enter last Name");
                String lastName = sc.next();
                lastName(lastName);
                break;
        }
    }

}