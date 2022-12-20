Feature: Hotel Booking 

Scenario: Login Page 

	Given user launch The Application 
	
	When  user Enter The Username In Username Field 
	
	And user Enter The Password In Password Field 
	
	Then user Click On The Login Button And It Navigates to Adactin.com - Search Hotel 
	
Scenario: Search Hotel 

	When user Select The Location 
	
	And user Select The Hotels 
	
	And user Select The Room Type 
	
	And user Select The Number Of Rooms 
	
	And user Select The Check In Date 
	
	And user Select The Check Out Date 
	
	And user Select The Adults Per Room 
	
	And user Select The Childern Per Room 
	
	Then user click on Search Button And It Navigates to Adactin.com - Select Hotel 
	
Scenario: Select Hotel 

	When user Select The Hotel 
	
	Then user Select The Continue Button And It Navigates to Adactin.com - Book A Hotel 
	
Scenario: Book A Hotel 

	When user Enter The Firstname In First Name Field 
	
	And user Enter The Lastname In Last Name Field 
	
	And user Enter The Billing Address 
	
	And user Enter the Credit Card No 
	
	And user Select The Credit Card Type 
	
	And user Select The Expiry Month 
	
	And user Select The Expiry Year 
	
	And user Enter The Cvv Number 
	
	Then user Click On Book Now Button And It Navigates to Adactin.com - Hotel Booking Confirmation Page 
	
Scenario: Confrim Booking 

	Then user Click On My Itinenary Button And It Navigates To Booked Itineray Page 
	
Scenario: Logout 

	Then user Click On Logout Button And It Navigates To Adactin.com - Logout Page 
