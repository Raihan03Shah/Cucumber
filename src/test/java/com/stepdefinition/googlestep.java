package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlestep extends BaseClass   {
	
	
	@Given("User Must Launch The {string} Browser")
	public void user_must_launch_the_browser(String string) {
		launchBrowser(string);
		
	}

	@When("User launch the url {string}")
	public void user_launch_the_url(String string) {
		launchUrl(string);
		
		
	}

	@When("User must enter the {string} in the username field")
	public void user_must_enter_the_in_the_username_field(String string) {
		WebElement element = driver.findElement(By.id("username"));
		passInput(element, string);
	}

	@Then("User must enter the {string} in the password field")
	public void user_must_enter_the_in_the_password_field(String string) {
		WebElement element2 = driver.findElement(By.id("password"));
		passInput(element2, string);
	}

	@Then("user must click the click buttom and its navigate to next page")
	public void user_must_click_the_click_buttom_and_its_navigate_to_next_page() {
		driver.findElement(By.id("login")).click();
	}

	@Given("user must launch {string} browser")
	public void user_must_launch_browser(String string) {
		launchBrowser(string);
	}

	@When("user must launch the url {string}")
	public void user_must_launch_the_url(String string) {
		launchUrl(string);
	}


}
