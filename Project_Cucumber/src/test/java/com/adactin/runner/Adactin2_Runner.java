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

		features = ".//FeatureFiles//Adactin2.feature",

		glue = {"com.stepdefnition2" , "com.hooks"},

		dryRun = false,

		monochrome = true,

		publish = true,

		tags = "@Sunshine or @Hervey",
		
		plugin = {

				"html:Reports/Adactin_Hooks.html", "json:Reports/Adactin_Hooks.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class Adactin2_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Utility_Files.browser_Launch("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		Utility_Files.close();
	}

}

