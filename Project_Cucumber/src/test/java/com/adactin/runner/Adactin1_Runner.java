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

		features = ".//FeatureFiles//Adactin1.feature",

		glue = "com.stepdefnition1",

		dryRun = false,

		monochrome = true,

		publish = true,

		tags = "@group1 or  @group2 or  @group3",

		plugin = {

				"html:Reports/Adactin.html", "json:Reports/Adactin.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class Adactin1_Runner {

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

