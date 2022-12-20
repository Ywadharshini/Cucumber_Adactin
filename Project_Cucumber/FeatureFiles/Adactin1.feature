Feature: Hotel Booking 

@group1 
Scenario Outline: Login Page 

	Given user launch The Application 
	
	When  user Enter The "<username>" In Username Field 
	
	And user Enter The "<password>" In Password Field 
	
	Then user Click On The Login Button And It Navigates to Adactin.com - Search Hotel 
	
	Examples: 
		|username||password|
		|abc@gmail.com||abc10|
		|Ywadharshini||junnu06|
		
		@group1 
		Scenario: Search Hotel 
		
			When user Select "London" 
			
			And user Select The Hotels 
			
			And user Select The Room Type 
			
			And user Select The Number Of Rooms 
			
			And user Select The Check In Date 
			
			And user Select The Check Out Date 
			
			And user Select The Adults Per Room 
			
			And user Select The Childern Per Room 
			
			Then user click on Search Button And It Navigates to "Adactin.com - Select Hotel" 
			
		@group2 
		Scenario: Select Hotel 
		
			When user Select The Hotel 
			
			Then user Select The Continue Button And It Navigates to "Adactin.com - Book A Hotel" 
			
			
		@group2 
		Scenario: Book A Hotel 
		
			When user Enter "Ywa" In First Name Field 
			
			And user Enter "dharshini" In Last Name Field 
			
			And user Enter "Salem" In Address Field 
			
			And user Enter "1234567898765430" In Card Number Field 
			
			And user Select "MAST" In Credit Card Type 
			
			And user Select "March" In  Expiry Month 
			
			And user Select "12" Expiry Year 
			
			And user Enter "123" In Cvv Number 
			
			Then user Click On Book Now Button And It Navigates to "Adactin.com - Book A Hotel" 
			
			
		@group2 
		Scenario: Confrim Booking 
		
			Then user Click On My Itinenary Button And It Navigates To "Adactin.com - Select Hotel" 
			
			
		@group3 
		Scenario: Logout 
		
			Then user Click On Logout Button And  It Navigates To "Adactin.com - Logout" 
			
			
			
