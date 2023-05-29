package com.runner;

import org.junit.runner.RunWith;


@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions (features = "C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\feature\\Adactin.feature",
glue = "com.stepdefinition1",monochrome = true, plugin = {"html:Report/Cucumber_Report.html"})

public class google {
	
	


}
