package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\feature\\Adactin.feature",
glue = "com.stepdefinition1", plugin = {"html:Report/Cucumber_Report.html"})
public class adactin {

}
