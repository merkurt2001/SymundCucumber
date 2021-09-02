@SYMU-523
Feature: Profile Settings

	Background:
		#@SYMU-470
		Given the user login with valid credentials

	#User Story :
	#As a user, I should be able to change profile info settings under the Profile module
	#Acceptance Criteria:
	# # User can see at least following titles inside personal info under Profile Settings page;=>Full name/Email/Phone Number
	# # User can change "Full name" info under Profile Settings page
	# # User can make "Phone number" info as private under Profile Settings page
	# # User can see the current local time under the Local dropdown

	@SYMU-516
	Scenario: Verify that user can change Full name info under Profile Settings page
		    When the user clicks user profile icon and after clicks on settings option
		    When the user deletes the current full name and types new full name as "guney"
		    Then new full name "guney" should be displayed under profile icon after refreshing the page	


	@SYMU-515
	Scenario: Verify that user can see following titles inside personal info on the Profile Settings page
		When the user clicks user profile icon and after clicks on settings option
		Then the user should be able to see following titles
		      | Profile picture |
		      | Full name       |
		      | Email           |
		      | Phone number    |
		      | Address         |
		      | Website         |
		      | Twitter         |
		      | Language        |
		      | Locale          |	


	@SYMU-517
	Scenario Outline: Verify that user can make phone number info as "<options>" under Profile Settings page
		    When the user clicks user profile icon and after clicks on settings option
		    When the user clicks on the phone number options
		    And the user chooses "<options>" option
		    Then the icon should return "<iconType>" icon next to the Phone number section
		    Examples:
		      | options   | iconType |
		      | Private   | phone    |
		      | Local     | password |
		      | Federated | dark     |
		      | Published | link     |	


	@SYMU-518
	Scenario: Verify that user can see the current local time under the Local dropdown
		    When the user clicks user profile icon and after clicks on settings option
		    Then the user should be able to see the current local time