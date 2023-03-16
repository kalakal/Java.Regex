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

    public static void main(String[] args) {
        System.out.println("Welcome in User registration program using Regex");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next();
        firstName(firstName);

    }

}
