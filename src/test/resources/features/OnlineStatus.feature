@SYMU-494
Feature:

  Background:
     #@SYMU-470
    Given the user login with valid credentials


  @SYMU-478 #pass
  Scenario: Verify that user can view Online status-SA
    When the user clicks user profile icon
    Then the user can see status



  @SYMU-483 #pass
  Scenario Outline: Verify that user can change Online status-SA
    When the user clicks user profile icon
    Then the user can see status
    And the user click on status
    Then the user can see the status modal page
    And the user can click any  "<status>"
    Then the user click on Set Status Message
    And  the user clicks user profile icon
    And the user can see "<display>" on status
    Examples:
      | status    |  | display        |
      | online    |  | Online         |
      | away      |  | Away           |
      | dnd       |  | Do not disturb |
      | invisible |  | Invisible      |


  @SYMU-484 #pass
  Scenario: Verify that User can set a status message from any default options-SA
    When the user clicks user profile icon
    And the user click on status
    Then the user can see the status modal page
    When the user clicks to "In a meeting" status message
	#	And the user can change "<statusMessages>"
    Then the user click on Set Status Message
    And the user clicks user profile icon
    And the user can see "📅 In a meeting" on status

	#	Examples:
	#	        |statusMessages|
	#	        |In a meeting|
	#	        |Commuting|
	#	        |Working remotely|
	#	        |Out sick|
	#	        |Vacationing|




  @SYMU-493 #pass
  Scenario: Verify that user can set a custom message,also using any emoji option provided-SA
    When the user clicks user profile icon
    And the user click on status
    Then the user can see the status modal page
    And the user delete previous message clicking on clearStatus
    When the user clicks user profile icon
    And the user click on status
    Then the user can see the status modal page
    And the user can type a custom message
    When the user clicks to emoji icon and chooses emoji "grinning"
    Then the user click on Set Status Message
    And the user clicks user profile icon
    And the user can see "😀 Hello World" on status