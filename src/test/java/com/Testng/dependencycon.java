package com.Testng;

import org.testng.annotations.Test;

public class dependencycon {
@Test(dependsOnMethods ="login" )
	private void credential() {
		System.out.println("credential");

	}
@Test
	private void login() {
		System.out.println("login");
	}
}
