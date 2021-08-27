Feature: Profile Settings


  Scenario: User can see following "<titles>" inside personal info on the Profile Settings page;
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

