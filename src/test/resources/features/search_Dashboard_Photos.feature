@SYMU-482
Feature:

	Background:
		#@SYMU-470
		Given the user login with valid credentials


	@SYMU-477
	Scenario: Magnifying glass icon functionalities-UY
		Then the user click to "magnifyIcon"
		And the user types file name as "Photo" and can see file full name
		Then the user click to "Photo" file
		And the user should see the details side page of the "Photo" file

	@SYMU-479
	Scenario: Search contacts by clicking on the contacts icon - UY
		Then the user click to "contactsMenu"
		Then the user types file name as "uguney" and can see file full name


	@SYMU-480
	Scenario:  Images files under the Photos module - UY
		When the user navigate to "photos" page
		Then see only the images files with the extension of jpeg jpg


	@SYMU-481
	Scenario: Navigate to Dashboard page by clicking the Symund icon - UY

	Scenario Outline: Symund icon
		When the user navigate to "<navigatePageName>" page
		Then the user click to "pageLogo"
		Then the user on "dashboard" page
		Examples:
			| navigatePageName |
			| files            |
			| photos           |
#			| activity         |
#			| spreed           |
#			| mail             |
#			| contacts         |
#			| circles          |
#			| calendar         |
#			| notes            |
#			| deck             |
#			| tasks            |

    #*User Story :
	#
	#As a user, I should be able to search file or contact from the Dashboard and see the photos under Photos Module{color}
	#
	#Acceptance Criteria:
	# # User can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.{color}
	# # User can search contacts by clicking on the contacts icon and typing its name{color}
	# # User can see only the images files with the extension of .jpeg/.jpg under the Photos module when uploaded them{color}*
	# # User can navigate to Dashboard page whenever clicking the Symund icon on Dashboard{color}