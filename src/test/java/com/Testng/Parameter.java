package com.Testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters({"username1","password1"})
	private void Credentials(@Optional("department")String username1, @Optional("1234")String password1) {
		System.out.println("User Name is: " + username1);
		System.out.println("Password is: " + password1);
	}

}
