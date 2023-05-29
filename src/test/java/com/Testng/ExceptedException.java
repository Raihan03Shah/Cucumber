package com.Testng;

import org.testng.annotations.Test;

public class ExceptedException {
@Test	(expectedExceptions = ArithmeticException.class)
	private void Demo() {
int a =10;
System.out.println(a/0);
	}

}
