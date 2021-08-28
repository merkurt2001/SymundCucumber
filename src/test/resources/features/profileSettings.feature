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

  Scenario: User can see following titles inside personal info on the Profile Settings page;
    Given the user is on the login page
    When the user should be able to login with "Employee11" and "Employee123" and ENTER
    And the user clicks user profile icon and after clicks on settings option
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

