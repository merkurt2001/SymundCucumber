Feature:Contacts module
  Background:
    Given the user login with valid credentials
    When the user navigate to contacts tab


    @SYMU-472
   Scenario Outline:Verify that user can create a new contact
    And  Click to "New Contact"
    And  user enter "<name>" and "<lastname>"
    Then "<name>" contacts appears in the All contacts list

      Examples:
      |name   |lastname|
      |mike  | smith |






    @SYMU-473
    Scenario: Verify that user can see all contact as a list and total number
      Then "mike" contacts appears in the All contacts list



  @SYMU-474
  Scenario: Verify that user can change pfofile  picture
    And Click to "first contacts"
    And Click to "Picture"
    Then Click to "Choose from file"
    Then choose "Yeni-Toyota" picture


  @SYMU-475
  Scenario: Verfy that user can delete contact
    And Click to "first contacts"
    And Click to "icon"
    Then user can delete with click to delete





