package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
	private void Demo() {
String exp = "Rayan";
String act = "Rayan";

Assert.assertEquals(act, exp);

System.out.println("Validation");
	}
}
