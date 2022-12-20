package com.hooks;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin2_Runner;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility_Files {

	public static WebDriver driver = Adactin2_Runner.driver;
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Before(order = 0)
	public void login() {
		url_Launch("https://adactinhotelapp.com/");
	}

	@Before(order = 1)
	public void maximixe() {
		manage_Commands("maximize");
	}

	@After(order = 2)
	public void logout() {
		click_On_Element(manager.getIp().getLogoutBtn());
	}

	@After(order = 1)
	public void title() {
		System.out.println(get_Title());
	}
}
