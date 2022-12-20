Feature: Hotel Booking 

Background: Login Page 

	#Given user launch The Application 
	
	Given  user Enter The Username In Username Field 
	
	When user Enter The Password In Password Field 
	
	And user Click On The Login Button And It Navigates to Adactin.com - Search Hotel 
	
	
@Sunshine	
Scenario: Book  Hotel Sunshine 

	When user Select The Location 
	
	And user Select The Hotels 
	
	And user Select The Room Type 
	
	And user Select The Number Of Rooms 
	
	And user Select The Check In Date 
	
	And user Select The Check Out Date 
	
	And user Select The Adults Per Room 
	
	And user Select The Childern Per Room 
	
	And user click on Search Button And It Navigates to "Adactin.com - Select Hotel" 
	
	And user Select The Hotel 
	
	And user Select The Continue Button And It Navigates to "Adactin.com - Book A Hotel" 
	
	And user Enter "Ywa" In First Name Field 
	
	And user Enter "dharshini" In Last Name Field 
	
	And user Enter "Salem" In Address Field 
	
	And user Enter "1234567898765430" In Card Number Field 
	
	And user Select "MAST" In Credit Card Type 
	
	And user Select "March" In  Expiry Month 
	
	And user Select "12" Expiry Year 
	
	And user Enter "123" In Cvv Number 
	
	And user Click On Book Now Button And It Navigates to "Adactin.com - Book A Hotel" 
	
	And user Click On My Itinenary Button And It Navigates To "Adactin.com - Select Hotel" 
	
#	Then user Click On Logout Button And  It Navigates To "Adactin.com - Logout" 
	
#	Then user Click on LoginAgain Link 
	
@Hervey	
Scenario: Book  Hotel Hervey 
	
	When user Select The Location As  "Sydney"
	
	And user Select The Hotel As "Hotel Hervey"
	
	And user Select The Room Type As "Deluxe" 
	
	And user Select The Number Of Rooms "4"
	
	And user Select  Check In Date 
	
	And user Select  Check Out Date 
	
	And user Select  Adults Per Room 
	
	And user Select  Childern Per Room 
	
	And user click On The Search Button And It Navigates to "Adactin.com - Select Hotel"
	
	And user Select The Hotel Radio Button
	
	And user Select  Continue Button And It Navigates to "Adactin.com - Book A Hotel" 
	
	And user Enter The "Ywa" In First Name Field 
	
	And user Enter The "dharshini" In Last Name Field 
	
	And user Enter The "Salem" In Address Field 
	
	And user Enter The "1234567898765430" In Card Number Field 
	
	And user Select The "MAST" In Credit Card Type 
	
	And user Select The "March" In  Expiry Month 
	
	And user Select The "12" Expiry Year 
	
	And user Enter The "123" In Cvv Number 
	
	And user Click On The Book Now Button And It Navigates to "Adactin.com - Book A Hotel" 
	
	And user Click On The  My Itinenary Button And It Navigates To "Adactin.com - Select Hotel" 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	