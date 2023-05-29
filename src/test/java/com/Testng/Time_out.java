package com.Testng;

import org.testng.annotations.Test;

import com.Base.BaseClass;

public class Time_out {
	public class Cross_Browser_Test extends BaseClass{

		@Test(timeOut = 5000)
		private void Chrome() throws InterruptedException {
			Thread.sleep(2000);
			launchBrowser("chrome");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
		@Test
		private void firefox() throws InterruptedException {
			Thread.sleep(3000);
			launchBrowser("firefox");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
		@Test
		private void edge() throws InterruptedException {
			Thread.sleep(1000);
			launchBrowser("edge");
			launchUrl("https://www.google.co.in/");
			System.out.println("Browser ID:" + Thread.currentThread().getId() );
			closeBrowser();
		}
	}

}
