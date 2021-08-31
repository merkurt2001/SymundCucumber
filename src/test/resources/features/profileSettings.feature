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

  Background:
    Given the user is on the login page
    When the user should be able to login with "Employee11" and "Employee123" and ENTER
    And the user clicks user profile icon and after clicks on settings option

  Scenario: User can see following titles inside personal info on the Profile Settings page;
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
@wip
Scenario: User can change "Full name" info under Profile Settings page
  When the user deletes the current full name and types new full name as "guney"
 # And the user confirms the password typing "Employee123"
  And new full name "guney" should be displayed under profile icon after refreshing the page

Scenario: User can make "Phone number" info as private under Profile Settings page
  When the user clicks on the phone number options












