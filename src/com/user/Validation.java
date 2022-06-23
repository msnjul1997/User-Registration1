package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	 public void check(boolean ans)
	    {
	        if(ans)
	        {
	            System.out.println("Valid");
	        }
	        else
	        {
	            System.out.println("Not valid");
	        }
	    }
	 public boolean nameValidation(String name)
	    {
	        String regex ="^[A-Z]{1}+[a-z]{2,}$";
	        Pattern pt = Pattern.compile(regex);
	        Matcher mt = pt.matcher(name);
	        check(mt.find());
			return false;
	    }
	 public void emailValidation(String email)
	    {
	        String regex = "^[abc]{1}[A-Za-z0-9]*@{1}[A-Za-z0-9]{1,}.com{1}";
	        Pattern pt = Pattern.compile(regex);
	        Matcher mt = pt.matcher(email);
	        check(mt.find());
	    }
	 
	 public void phoneNumberValidation(String phone)
	    {
	        String regex = "^(91|0)?+[7-9]{1}+[0-9]{9}$";
	        Pattern pt = Pattern.compile(regex);
	        Matcher mt = pt.matcher(phone);
	        check(mt.find());
	    }
	 public void passwordValidation1(String password)
	    {
	        // Rule 1 = Minimum 8 characters 
	        String regex = "^(?=.[a-z0-9!@#&()–[{}]:;',?/*~$^+=<>])(?=.*[A-Z]).{8,}";
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(password);
	        check(m.find());
	    }
	 public void passwordValidation(String password)
	    {
		    // Rule 2 = Min 8 Characters & One UpperCase
		    String regex = "^(?=.[a-z0-9!@#&()–[{}]:;',?/*~$^+=<>])(?=.*[A-Z]).{8,}";
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(password);
	        check(m.find());
	    }
}
