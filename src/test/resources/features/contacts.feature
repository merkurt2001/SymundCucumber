Feature:Contacts module
  Background:
    Given the user login with valid credentials


    @SYMU-472
   Scenario Outline:Verify that user can create a new contact
    When the user navigate to contacts tab
    And  Click to "New Contact"
    And  user enter "<name>" and "<lastname>"
    Then "<name>" contacts appears in the All contacts list

      Examples:
      |name   |lastname|
      |mike   | smith  |









