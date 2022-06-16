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

}
