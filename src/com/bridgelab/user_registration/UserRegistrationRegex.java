package com.bridgelab.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// UC3-Method for validation of Email.
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
    public static void email(String email) {
        String regex = "^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(email);
        if (match.matches()) {
            System.out.println(email + " : is a valid email ");
        } else {
            System.out.println(email + " : is a invalid email ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome in User registration program using Regex");
        Scanner sc = new Scanner(System.in);
        System.out.println("What do want enter \n1. First Name \n2. Last Name \n3. E-mail");
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
            case 3:
                System.out.println("Enter e-mail");
                String email = sc.next();
                email(email);
                break;
        }
    }

}