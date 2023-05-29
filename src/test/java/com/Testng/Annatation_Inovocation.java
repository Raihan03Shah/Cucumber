package com.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annatation_Inovocation {
	@BeforeSuite
	private void propertyseting() {
		System.out.println("propertyseting");
	}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("browserlaunch");
	}
	@org.testng.annotations.BeforeClass
	private void URLlaunch() {
		System.out.println("URLlaunch");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@org.testng.annotations.Test (invocationCount = 3)
	public void women() {
		System.out.println("women");
	}
	@org.testng.annotations.Test
	public void men() {
		System.out.println("men");
	}
	@org.testng.annotations.Test
	public void kids() {
		System.out.println("kids");
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	@org.testng.annotations.AfterClass
	private void screenshoot() {
		System.out.println("screenshoot");
	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	@AfterSuite
	private void quit() {
		System.out.println("quit");
	}
	


}
