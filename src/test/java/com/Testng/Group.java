package com.Testng;

import org.testng.annotations.Test;


public class Group {
	
	@Test(groups = "food")
	private void Egg() {
		System.out.println("egg");
	}
		@Test(groups = "Ec")
		private void Electronics () {
			System.out.println("mobile");		
		}
		@Test(groups = "Wood") 
		private void Wood() {
			System.out.println("Table");
		}
		@Test(groups = "Wood")
		private void wood() {
			System.out.println("Chair");
		}
		@Test(groups = "Food")
		private void rice() {
			System.out.println("Rice");
		}
			@Test(groups = "Ec")
			private void watch() {
				System.out.println("watch");
			}}

		
			
			
		
	


