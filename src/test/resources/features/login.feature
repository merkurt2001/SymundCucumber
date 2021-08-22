@SYMU-332
Feature:

	@login
		Scenario: User Login
		Given the user login with valid credentials
		Then the user on dashboard page


	@SYMU-322
	Scenario Outline: UY-users can login with valid credentials
		
		    Given the user is on the login page
		    When the user logged in with "<username>" and "<password>" 
		    Then the user on Dashboard page and user profile as expected "<username>"
		    Examples:   
		    |username   |password   |
		    |Employee1  |Employee123|
		    |Employee50 |Employee123|
#		    |Employee150|Employee123|
#		    |Employee225|Employee123|
#		    |Employee299|Employee123|
		  
		    	


	@SYMU-323
	Scenario: UY-users can login with ENTER
		
		    Given the user is on the login page
		    And the user should be able to login with "Employee111" and "Employee123" and ENTER
		    Then the user on Dashboard page and user profile as expected "Employee111"
		   
		  
		    	


	@SYMU-324
	Scenario Outline: UY-User can not login with any invalid credentials
		
		    Given the user is on the login page
		    When the user logged in with "<username>" and "<password>"
		    Then verify the user cannot login and get error message "Wrong username or password."
		    Examples:   
		    |username   |password   |
		    |EmployeeA  |Employee123|
		    |Employe50  |Employee12 |
		   
		    	


	@SYMU-325
	Scenario: UY-User can not login with blank username
		
		    Given the user is on the login page
		    When the user logged in with "" and "Employee123" 
		    Then verify the user get error message from empty username "Please fill out this field."
		   


	@SYMU-327
	Scenario: UY-User can not login with blank password
		
		    Given the user is on the login page
		    When the user logged in with "Employee111" and "" 
		    Then verify the user get error message from empty password "Please fill out this field."
		   
		  

	@SYMU-328
	Scenario: UY-User can see the password in a form of dots by default

		    Given the user is on the login page
		    Then verify the user can see the password in a form of dots by default



	@SYMU-329
	Scenario: UY-User can see the password explicitly if needed

		    Given the user is on the login page
		    Then verify the user can see the password explicitly
		   

	@SYMU-330
	Scenario: UY-User can see  "forgot password" on the login page
		
		    Given the user is on the login page
		    When verify the user can see forgot password on the login page
		    Then verify the user can see reset password 
		   

	@SYMU-331
	Scenario: UY-User can see valid placeholders on Username and Password fields
		
		    Given the user is on the login page
		    Then verify placeholders should be "Username or email" and "Password"
		   
		  
		    