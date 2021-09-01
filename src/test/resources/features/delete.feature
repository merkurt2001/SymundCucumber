Feature: delete functionalities
  Background:
    Given the user login with valid credentials
    And the user navigate to "files" page

  Scenario: User should able to see the most recent deleted file in the first line of the deleted file list
  when deleted files ordered by newest to oldest
    And the user get text that belongs to first line folder
    When the user delete first file in the page
    And the user navigate left side to "Deleted files"
    And the user click order button
    Then verify that the most deleted file is placed the first line


    Scenario: User should able to order alphabetically all the deleted files based on their names and vice versa
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
        And the user navigate left side to "Deleted files"
        When define Box
        And delete folder
        Then verify that delete file permanently

      Scenario:  User should able to restore any deleted file and see it again under the All Files tab
        Given the user navigate left side to "Deleted files"
        Given click pickButton
        And get name as a string
        And click restoreButton
        When the user navigate to "files" page
        And get all folder names
        Then verify that restored file is seen under the All Files tab


      Scenario: User should able to order the all deleted files by oldest to newest
        Given the user navigate left side to "Deleted files"
        Then verify that deleted files are ordered by oldest to newest as default




      Scenario:  User should able to order the all deleted files by newest to oldest
        Given the user navigate left side to "Deleted files"
        When click the deleted button
        Then verify that deleted files are ordered by newest to oldest










