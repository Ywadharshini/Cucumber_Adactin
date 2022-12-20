package com.stepdefnition1;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.adactin.runner.Adactin1_Runner;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import singleton.reader.classs.Adactin_File_Reader;

public class Adactin_Stepdef1 extends Utility_Files {

	public static WebDriver driver = Adactin1_Runner.driver;

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Given("user launch The Application")
	public void user_launch_the_application() throws InterruptedException {

		url_Launch("https://adactinhotelapp.com/");

		manage_Commands("maximize");

		sleep(1000);
	}

	
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
		
		send_Keys(manager.getLp().getUserName(), username);  
	}
	
	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
	 
		send_Keys(manager.getLp().getPassword(), password);
	}


	@Then("user Click On The Login Button And It Navigates to Adactin.com - Search Hotel")
	public void user_click_on_the_login_button_and_it_navigates_to_adactin_com_search_hotel()
			throws InterruptedException {

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);
	}

	@When("user Select {string}")
	public void user_select(String location) {

		dropDown(manager.getShp().getLocation(), "visible Text", location);
	}

	@When("user Select The Hotels")
	public void user_select_the_hotels() throws IOException {

		String hotel = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getHotel();

		dropDown(manager.getShp().getHotels(), "index", hotel);

	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() throws IOException {

		String roomType = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getRoomType();

		dropDown(manager.getShp().getRoomType(), "value", roomType);
	}

	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() throws IOException {

		String noOfRooms = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getNoOfRooms();

		dropDown(manager.getShp().getNoOfRooms(), "value", noOfRooms);
	}

	@When("user Select The Check In Date")
	public void user_select_the_check_in_date() throws IOException {

		clear_Element(manager.getShp().getCheckInDate());

		String checkInDate = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCheckInDate();

		send_Keys(manager.getShp().getCheckInDate(), checkInDate);

	}

	@When("user Select The Check Out Date")
	public void user_select_the_check_out_date() throws IOException {

		clear_Element(manager.getShp().getCheckOutDate());

		String checkOutDate = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCheckOutDate();

		send_Keys(manager.getShp().getCheckOutDate(), checkOutDate);

	}

	@When("user Select The Adults Per Room")
	public void user_select_the_adults_per_room() throws IOException {

		String adult = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getAdultRoom();

		dropDown(manager.getShp().getAdultPerRoom(), "index", adult);
	}

	@When("user Select The Childern Per Room")
	public void user_select_the_childern_per_room() throws IOException {

		String child = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getChildRoom();

		dropDown(manager.getShp().getChildPerRoom(), "value", child);

	}

	@Then("user click on Search Button And It Navigates to {string}")
	public void user_click_on_search_button_and_it_navigates_to(String expected_Title) throws InterruptedException {

		click_On_Element(manager.getShp().getSearchBtn());

		String title = expected_Title;

		String actual_Title = driver.getTitle();

		Assert.assertEquals(title, actual_Title);

	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {

		click_On_Element(manager.getHotel().getRadioBtn());
	}

	@Then("user Select The Continue Button And It Navigates to {string}")
	public void user_select_the_continue_button_and_it_navigates_to(String expected_Title) {

		click_On_Element(manager.getHotel().getContinueBtn());
		
		String title = expected_Title;

		String actual_Title = driver.getTitle();

		Assert.assertEquals(title, actual_Title);

	}

	@When("user Enter {string} In First Name Field")
	public void user_enter_in_first_name_field(String firstName) {

		send_Keys(manager.getBhp().getFirstName(), firstName);
	}

	@When("user Enter {string} In Last Name Field")
	public void user_enter_in_last_name_field(String lastName) {

		send_Keys(manager.getBhp().getLastName(), lastName);
	}

	@When("user Enter {string} In Address Field")
	public void user_enter_in_address_field(String address) {

		send_Keys(manager.getBhp().getAddress(), address);

	}

	@When("user Enter {string} In Card Number Field")
	public void user_enter_in_card_number_field(String cardNo) {

		send_Keys(manager.getBhp().getCardNo(), cardNo);

	}

	@When("user Select {string} In Credit Card Type")
	public void user_select_in_credit_card_type(String cardType) {

		dropDown(manager.getBhp().getCardType(), "value", cardType);

	}

	@When("user Select {string} In  Expiry Month")
	public void user_select_in_expiry_month(String expMonth) {

		dropDown(manager.getBhp().getExp_Month(), "visible text", expMonth);
	}

	@When("user Select {string} Expiry Year")
	public void user_select_expiry_year(String expYear) {

		dropDown(manager.getBhp().getExp_year(), "index", expYear);
	}

	@When("user Enter {string} In Cvv Number")
	public void user_enter_in_cvv_number(String cvv) {

		send_Keys(manager.getBhp().getCvv(), cvv);
	}

	@Then("user Click On Book Now Button And It Navigates to {string}")
	public void user_click_on_book_now_button_and_it_navigates_to(String expected_Title) throws InterruptedException {
		
		sleep(3000);

		click_On_Element(manager.getBhp().getBookNowBtn());

		String title = expected_Title;

		String actual_Title = driver.getTitle();

		Assert.assertEquals(title, actual_Title);
	}

	@Then("user Click On My Itinenary Button And It Navigates To {string}")
	public void user_click_on_my_itinenary_button_and_it_navigates_to(String expected_Title)
			throws IOException, InterruptedException {
		
		sleep(5000);

		click_On_Element(manager.getBcp().getItineraryBtn());

		sleep(2000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Project_Cucumber\\Screenshots\\hotelBook.png");

		sleep(2000);

		String title = expected_Title;

		String actual_Title = driver.getTitle();

		Assert.assertEquals(title, actual_Title);
	}

	@Then("user Click On Logout Button And  It Navigates To {string}")
	public void user_click_on_logout_button_and_it_navigates_to(String expected_Title) {
	    
		click_On_Element(manager.getIp().getLogoutBtn());

		String title = expected_Title;

		String actual_Title = driver.getTitle();
		
		Assert.assertEquals(title, actual_Title);
	}

}
