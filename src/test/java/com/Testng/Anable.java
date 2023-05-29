package com.Testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class Anable {
	
	public class Cross_Browser_Test extends BaseClass{

		@Test
		private void Chrome() {
			launchBrowser("chrome");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
		@Ignore
		@Test
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
	}

}
