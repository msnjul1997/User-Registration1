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
	}
	

}
