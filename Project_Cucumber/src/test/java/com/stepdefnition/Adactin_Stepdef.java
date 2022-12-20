package com.stepdefnition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_Runner;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import singleton.reader.classs.Adactin_File_Reader;

public class Adactin_Stepdef extends Utility_Files {
	

	public static WebDriver driver = Adactin_Runner.driver;

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Given("user launch The Application")
	public void user_launch_the_application() throws InterruptedException {

		url_Launch("https://adactinhotelapp.com/");

		manage_Commands("maximize");

		sleep(1000);
	}

	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() throws IOException {

		String userName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getusername();

		send_Keys(manager.getLp().getUserName(), userName);
	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() throws IOException {

		String password = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();

		send_Keys(manager.getLp().getPassword(), password);

	}

	@Then("user Click On The Login Button And It Navigates to Adactin.com - Search Hotel")
	public void user_click_on_the_login_button_and_it_navigates_to_adactin_com_search_hotel()
			throws InterruptedException {

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);
	}

	@When("user Select The Location")
	public void user_select_the_location() throws IOException {

		String location = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getLocation();

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

	@Then("user click on Search Button And It Navigates to Adactin.com - Select Hotel")
	public void user_click_on_search_button_and_it_navigates_to_adactin_com_select_hotel() throws InterruptedException {

		click_On_Element(manager.getShp().getSearchBtn());

		sleep(2000);
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {

		click_On_Element(manager.getHotel().getRadioBtn());

	}

	@Then("user Select The Continue Button And It Navigates to Adactin.com - Book A Hotel")
	public void user_select_the_continue_button_and_it_navigates_to_adactin_com_book_a_hotel() {

		click_On_Element(manager.getHotel().getContinueBtn());

	}

	@When("user Enter The Firstname In First Name Field")
	public void user_enter_the_firstname_in_first_name_field() throws IOException {

		String firstName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getFirstName();

		send_Keys(manager.getBhp().getFirstName(), firstName);

	}

	@When("user Enter The Lastname In Last Name Field")
	public void user_enter_the_lastname_in_last_name_field() throws IOException {

		String lastName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getLastName();

		send_Keys(manager.getBhp().getLastName(), lastName);
	}

	@When("user Enter The Billing Address")
	public void user_enter_the_billing_address() throws IOException {

		String address = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getAddress();

		send_Keys(manager.getBhp().getAddress(), address);

	}

	@When("user Enter the Credit Card No")
	public void user_enter_the_credit_card_no() throws IOException {

		String cardNo = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCardNo();

		send_Keys(manager.getBhp().getCardNo(), cardNo);
	}

	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() throws IOException {

		String cardType = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCardType();

		dropDown(manager.getBhp().getCardType(), "value", cardType);

	}

	@When("user Select The Expiry Month")
	public void user_select_the_expiry_month() throws IOException {

		String expMonth = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getExpMonth();

		dropDown(manager.getBhp().getExp_Month(), "visible text", expMonth);
	}

	@When("user Select The Expiry Year")
	public void user_select_the_expiry_year() throws IOException {

		String expYear = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getExpYear();

		dropDown(manager.getBhp().getExp_year(), "index", expYear);
	}

	@When("user Enter The Cvv Number")
	public void user_enter_the_cvv_number() throws IOException {

		String cvv = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCvv();

		send_Keys(manager.getBhp().getCvv(), cvv);
	}

	@Then("user Click On Book Now Button And It Navigates to Adactin.com - Hotel Booking Confirmation Page")
	public void user_click_on_book_now_button_and_it_navigates_to_adactin_com_hotel_booking_confirmation_page()
			throws InterruptedException {

		sleep(3000);

		click_On_Element(manager.getBhp().getBookNowBtn());
	}

	@Then("user Click On My Itinenary Button And It Navigates To Booked Itineray Page")
	public void user_click_on_my_itinenary_button_and_it_navigates_to_booked_itineray_page()
			throws InterruptedException, IOException {

		sleep(5000);

		click_On_Element(manager.getBcp().getItineraryBtn());

		sleep(2000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Project_Cucumber\\Screenshots\\hotelBook.png");

	}

	@Then("user Click On Logout Button And It Navigates To Adactin.com - Logout Page")
	public void user_click_on_logout_button_and_it_navigates_to_adactin_com_logout_page() {

		click_On_Element(manager.getIp().getLogoutBtn());

	}
	

}
