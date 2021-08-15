@SYMU-371
Feature: 

	@SYMU-369
	Scenario: Log out functionality -UY
		    Given the user is on the login page
		    When the user logged in with "Employee111" and "Employee123" 
		    Then the user should be able to log out and ends up in login page	


	@SYMU-370
	Scenario: User can not go to home page again by clicking step back button -UY
		    Given the user is on the login page
		    When the user logged in with "Employee111" and "Employee123" 
		    And the user should be able to log out and ends up in login page
		    Then the user can not go to home page again by clicking step back button