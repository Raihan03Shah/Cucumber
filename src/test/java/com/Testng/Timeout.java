package com.Testng;

import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut = 5000)
	
	public void login() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("Browser launch ");
	Thread.sleep(3000);
	System.out.println("URL Launch");
	Thread.sleep(1000);
	System.out.println("Login");
	}

}
