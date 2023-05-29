package com.Testng;

import org.testng.annotations.Test;

import com.Base.BaseClass;

public class Ignore_Anable {
	
	public class Cross_Browser_Test extends BaseClass{

		@Test
		private void Chrome() {
			launchBrowser("chrome");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
		@Test(enabled = false)
		private void firefox() {
			launchBrowser("firefox");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
		@Test
		private void edge() {
			launchBrowser("edge");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}

	}}
