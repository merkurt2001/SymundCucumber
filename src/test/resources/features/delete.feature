@wip
Feature: delete functionalities

  Scenario: User should able to see the most recent deleted file in the first line of the deleted file list
  when deleted files ordered by newest to oldest
    Given the user login with valid credentials
    And the user navigate to "files" page
    And the user get text that belongs to first line folder
    When the user delete first file in the page
    And the user navigate left side to "Deleted files"
    And the user click order button
    Then verify that the most deleted file is placed the first line


    Scenario: User should able to order alphabetically all the deleted files based on their names and vice versa
      Given the user login with valid credentials
      And the user navigate to "files" page
      And the user navigate left side to "Deleted files"
      When the user get list as alphabetically
      And the user click name button
      And the user get list as default
      Then verify that all deleted files are ordered alphabetically
      And the user create a new list manually as the opposite direction of the alphabet
      And the user click name button
      And the user get list again
      Then verify that all deleted files are ordered the opposite direction of alphabet


      Scenario: User should able to delete any deleted file permenantly
      by using the three dots icon in the file’s line
        Given the user login with valid credentials
        And the user navigate to "files" page
        And the user navigate left side to "Deleted files"
        When define Box
        And delete folder
        Then verify that delete file permanently





