package com.Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
@Test	
	private void demo() {
String exp = "dhanisha";
String act = "dhanisha12";

SoftAssert s = new SoftAssert();
s.assertEquals(act, exp);
System.out.println("Verification"); 
	}

}
