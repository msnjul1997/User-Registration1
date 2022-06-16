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
	 public void nameValidation(String name)
	    {
	        String regex ="^[A-Z]{1}+[a-z]{2,}$";
	        Pattern pt = Pattern.compile(regex);
	        Matcher mt = pt.matcher(name);
	        check(mt.find());
	    }
	 public void emailValidation(String email)
	    {
	        String regex = "^[abc]{1}[A-Za-z0-9]*@{1}[A-Za-z0-9]{1,}.com{1}";
	        Pattern pt = Pattern.compile(regex);
	        Matcher mt = pt.matcher(email);
	        check(mt.find());
	    }

}
