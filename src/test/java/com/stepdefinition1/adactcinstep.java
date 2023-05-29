package com.stepdefinition1;

import org.openqa.selenium.By;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adactcinstep extends BaseClass{
	
	
	@Given("User Must Launch the {string} Browser")
	public void user_must_launch_the_browser(String string) {
		launchBrowser(string);
	   
	}

	@When("User Must Launch the Url {string}")
	public void user_must_launch_the_url(String string) {
		launchUrl(string);
	    	}

	@When("User Enter the <Username> in the username field")
	public void user_enter_the_username_in_the_username_field() {
		driver.findElement(By.id("username")).sendKeys("Raihanassam");
		
	   	}

	@Then("User enter the <Password> in the Password Field")
	public void user_enter_the_password_in_the_password_field() {
		driver.findElement(By.id("password")).sendKeys("1234567890");
	   	}

	@Then("User must click the Login button and It Navigate to the next page")
	public void user_must_click_the_login_button_and_it_navigate_to_the_next_page() {
		driver.findElement(By.id("login")).click();
	   	}
	@Given("User must launch the {string} browser1")
	public void user_must_launch_the_browser1(String string) {
		launchBrowser(string);
	}
	@When("User must launch the url1 {string}")
	public void user_must_launch_the_url1(String string) {
	launchUrl(string);
	}


		
	}

	



