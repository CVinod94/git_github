Feature: Functionality test for adactin application 

Scenario: To verify user can login application 
	Given User launchs the web borswer 
	When User enters the user name in user field 
	And User enters the password in passwrod field 
	Then User clicks the login button 
Scenario: To verify user can search hotels 
	When User selects location from location field 
	And User selects hotels from hostels filed 
	And User selects room type from room type field 
	And User selects no.of rooms from rooms filed 
	And user enter the checkin date in checkin filed 
	And User enter the checkout date in chekout filed 
	And User select adult per room in adult per room filed 
	And User select children per room in children per room filed 
	Then User clicks sreach button and verifies its navigates to next page 
Scenario: To check confirmatioin page 
	When User click radio button 
	Then User click continue button 
Scenario: To verify payment page 
	When User enters first name in  username textbox 
	And User enter last name in last name textbox 
	And user enters address in address filed 
	And User enters the card_no in card textbox 
	And User selects the card type from card type filed 
	And User selects the month from expiry date filed 
	And User selects the year from expiry date filed 
	And User enters the cvv_no in cvv_no filed 
	Then User clicks the book now button and verifies its navigates to next page 
Scenario: To verify user can logout application 
	Then user clicks logut_btn and verifies its navigates out of application 
	