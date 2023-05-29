package com.Testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedcon {
	
	@Test
	@Parameters({"username","password"})
	private void Credentials(@Optional("department")String username,String password) {
		System.out.println("User Name is: " + username);
		System.out.println("Password is: " + password);
	}

}


