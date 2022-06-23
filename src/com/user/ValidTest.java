package com.user;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ValidTest {
	private Validation v ;
	private String fname;
	private String lname;
	private String number;
	private String password;
	private String email;
	@Before
	public void setUp()
	{
		v = new Validation();
		fname = "Santhosh";
		lname = "Naik";
		number = "9494291232";
		password= "santhosh@225";
		email= "santhosh@gmail.com";
	}
	//For the first name and last name
		@Test
		public void nameValidation()
		{
			//Happy case for first name
			boolean ans1 = v.nameValidation(fname);
			Assert.assertEquals(true, ans1);
			//Sad case for first Name
			fname = "Santhosh";
			boolean ans2 = v.nameValidation(fname);
			Assert.assertEquals(false, ans2);
			//Happy case for last name
			lname = "Naik";
			boolean ans3 = v.nameValidation(lname);
			Assert.assertEquals(true, ans3);
			//Sad case for last name
			lname = "Tr";
			boolean ans4 = v.nameValidation(lname);
			Assert.assertEquals(false, ans4);
		}
		
		@Test
		public void emailValidation()
		{
			//Happy case for email 
			boolean ans1 = v.emailValidation(email);
			Assert.assertEquals(true,ans1);
			//Sad case for email 
			email = "santhosh@gmail.com";
			boolean ans2 = v.emailValidation(email);
			Assert.assertEquals(false, ans2);
			
			}
		@Test
		public void phoneNumberValidation()
		{
			//Happy case for phone number 
			boolean ans = v.phoneNumberValidation(number);
			Assert.assertEquals(true, ans);
			//Sad case for phone number 
			number = "9494291232";
			boolean ans1 = v.phoneNumberValidation(number);
			Assert.assertEquals(false, ans1);
			
		}
		@Test
		public void passwordValidation()
		{
			//Happy case for password 
			boolean ans1 = v.passwordValidation(password);
			Assert.assertEquals(true, ans1);
			//Sad case for password 
			password = "santhosh@225";
			boolean ans2 = v.passwordValidation(password);
			Assert.assertEquals(false, ans2);
		}
}
