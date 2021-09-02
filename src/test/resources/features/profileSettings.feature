
Feature: Profile Settings

#  User Story :
#
#  As a user, I should be able to change profile info settings under the Profile module
#
#  Acceptance Criteria:
#
#  1.User can see at least following titles inside personal info under Profile Settings page;
#   =>Full name/Email/Phone Number
#  2.User can change "Full name" info under Profile Settings page
#  3.User can make "Phone number" info as private under Profile Settings page
#  4.User can see the current local time under the Local dropdown

 #Given the user is on the login page
    #When the user should be able to login with "Employee11" and "Employee123" and ENTER

  Background:
    Given the user login with valid credentials



  Scenario: User can see following titles inside personal info on the Profile Settings page;
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



  Scenario: User can change Full name info under Profile Settings page
    When the user clicks user profile icon and after clicks on settings option
    When the user deletes the current full name and types new full name as "guney"
    Then new full name "guney" should be displayed under profile icon after refreshing the page


  Scenario Outline: User can make phone number info as "<options>" under Profile Settings page
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


  Scenario: User can see the current local time under the Local dropdown
    When the user clicks user profile icon and after clicks on settings option
    When the user should be able to see the current local time












