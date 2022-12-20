package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.utilityfiles.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//FeatureFiles//Adactin.feature",

		glue = "com.stepdefnition",

		dryRun = false,

		monochrome = true,

		publish = true,

		plugin = {

				"html:Reports/Adactin.html", "json:Reports/Adactin.json" }

)

public class Adactin_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = Utility_Files.browser_Launch("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		Utility_Files.close();
	}

}
