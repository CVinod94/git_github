package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.pom.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", 
glue = "com.adactin.stepdifination", plugin = {
//		"pretty", "html: Report/cucumberReport", "json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentreport.html" }
, monochrome = true, dryRun = false, strict = true)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws Throwable {

		String browser = FileReaderManager.getInstance().getInstanceReader().getBrowser();
		driver = Baseclass.getBrowser(browser);
//		 driver=Baseclass.getBrowser("chrome");

	}

}
