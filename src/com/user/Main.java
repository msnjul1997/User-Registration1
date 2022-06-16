package com.user;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("User-Regestrtion");
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter first name: ");
        String fname = sc.next();
        v.nameValidation(fname);
        

        System.out.println("Enter last name: ");
        String lname = sc.next();
        v.nameValidation(lname);
        
        System.out.println("Enter your Email-ID: ");
        String email = sc.next();
        v.emailValidation(email);
        
        System.out.println("Enter your 10 digit phone number: ");
        String phone = sc.next();
        v.phoneNumberValidation(phone);
        
        System.out.println("Enter your password(it should be of minimum length 8): ");
        String password1 = sc.next();
        v.passwordValidation(password1);
        
        System.out.println("Enter your password(it should be of min length 8 & One UpperCase): ");
        String password = sc.next();
        v.passwordValidation(password);

	}
	
}
