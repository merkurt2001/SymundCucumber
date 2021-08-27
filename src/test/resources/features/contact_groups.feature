@SYMU-465
Feature:Contact Groups Functionality
#User Story :
#
#As a user, I should be able to create a new group and add any contact into a group under Contacts module
#
#Acceptance Criteria:
#
#User can create a new group under Contacts Module
#User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
#User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
#User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu
  Background:
    Given the user login with valid credentials

  Scenario Outline: Verify that user can create new contact group
    When the user navigate to "Contacts" page
    And the user clicks on New group button
    And the user types a new group name
    And clicks with "<clickType>" on arrow sign
    Then new contact group should be created with that name

    Examples:
      | clickType |
      | enter     |
      | mouse     |

  Scenario: Verify that user can not create new contact group with an existing group name
    When the user navigate to "Contacts" page
    And the user clicks on New group button
    And the user types a group name that is previously created
    And clicks with "mouse" on arrow sign
    Then user should get "This group already exists" message

  Scenario: Verify that user can add any existing contact from the groups dropdown menu
  existing inside that specific contact’s own info menu
    When the user navigate to "Contacts" page
    And user clicks on a contact
    And user clicks on Groups option under related contact
    And selects a group from groups dropdown
    Then user should be seen as a group member under that group

  Scenario: Verify that user can see all the available groups name through the
  groups dropdown menu existing in the contact’s own info menu
    When the user navigate to "Contacts" page
    And user clicks on a contact
    And user clicks on Groups option under related contact
    Then user should be able to see all available group names

  Scenario: User can add a new property as “Birthday” to the contact’s info page
  from the “Add new property” dropdown menu
    When the user navigate to "Contacts" page
    And user clicks on a contact
    And user clicks on Choose property type under Add new property option
    And user selects "Birthday" from dropdown menu
    Then "Birthday" should be available under contact details

