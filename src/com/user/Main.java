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
	}
	

}
