package com.user;

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
	//Assert.assertEquals(___  ,  ___);
	// For the First name
	@Test
	public void setUp1()
	{
		// 1.Happy Case
		
		boolean one=v.nameValidation(fname);
		Assert.assertEquals(true, one);
		
	}
}
