package com.Testng;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "Nonveg")
	private void Egg() {
		System.out.println("Biriyani");
	}
		@Test(groups = "Nonveg")
		private void Electronics () {
			System.out.println("Chickenrice");		
		}
		@Test(groups = "Nonveg") 
		private void Wood() {
			System.out.println("Eggrice");
		}
		@Test(groups = "Nonveg")
		private void wood() {
			System.out.println("Grill");
		}
		@Test(groups = "veg")
		private void rice() {
			System.out.println("Momos");
		}
			@Test(groups = "Ec")
			private void watch() {
				System.out.println("watch");
			}
	

}
