@SYMU-526 @wip
Feature: Contact Groups Functionality

  Background:
		#@SYMU-470
    Given the user login with valid credentials

  @SYMU-520
  #hello

  Scenario Outline: Verify that user can create new contact group either with mouse or enter key
    When the user navigate to "contacts" page
    And the user clicks on New group button
    And the user types a new group name
    And clicks with "<clickType>"
    Then new contact group should be created with that name

    Examples:
      | clickType |
      | enter     |
      | mouse     |

 @SYMU-521
  Scenario: Verify that user can not create new contact group with an existing group name
    When the user navigate to "contacts" page
    And the user clicks on New group button
    And the user types a group name that is previously created
    And clicks with "mouse"
    Then user should get "This group already exists" message


  @SYMU-522
  Scenario: Verify that user can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
    When the user navigate to "contacts" page
    And user clicks on a contact
    And user clicks on Groups option under related contact
    And selects a group from groups dropdown
    Then contact should be seen as a group member under that group

 @SYMU-524
  Scenario: Verify that user can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
    When the user navigate to "contacts" page
    And user clicks on a contact
    And user clicks on Groups option under related contact
    Then user should be able to see all available group names

  @SYMU-525
  Scenario: User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu
    When the user navigate to "contacts" page
    And user clicks on a contact
    And user clicks on Choose property type under Add new property option
    And user selects "Birthday" from dropdown menu
    Then "Birthday" should be available under contact details