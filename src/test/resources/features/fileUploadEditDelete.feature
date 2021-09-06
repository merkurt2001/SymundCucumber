

Feature: File upload/edit/delete functionality

  Background: Verify that the user is on the Files page
    Given the user login with valid credentials
    And the user navigate to "files" page

    #failed
  Scenario: Verify that user can upload a file
    Given the user clicks on the + icon under the top menu
    Then the user should be able to display Upload file option
    When the user clicks on the Upload file button
    Then the user should be able to display uploaded file name in the Files page
   #passed
  Scenario: Verify that user can create a new folder
    Given the user clicks on the + icon under the top menu
    Then the user should be able to display New folder option
    When the user clicks on the New folder button
    Then the user should be able to enter "New folder name"
    When the user clicks on right arrow icon
    Then the user should be able to see You created "New folder name" on the right frame of the page
   #passed
  Scenario: Verify that user can move or copy any selected item to any folder
    When the user clicks on ellipsis icon in the line that "firstItem" exists
    Then the user should be able to display the "Move or copy" option in the right-click menu
    When the user clicks on Move or copy button
    Then the user should be able to display Choose target folder window
    And the user clicks on the "automationTestFolder"
    Then the user should be able to display Move to automationTestFolder button
    When the user clicks on Move to automationTestFolder button
    And the user clicks on the automationTestFolder in the Files page table
    Then the user should be able to display the moved folder name as "test TXT file"

   #passed
  Scenario: Verify that user can delete any selected item
    When the user clicks on ellipsis icon in the line that "firstItem" exists
    Then the user should be able to display the "Delete file" option in the right-click menu
    When the user clicks on "Delete file" button
    And the user clicks on the Deleted files button at the bottom of the left frame
    Then the user should be able to display the file whose name is "test PDF file" in deleted files page
    #passed
  Scenario: Verify that user can see the total number of files and folders under the files list table
    Then the user should be able to display the total number of files and folders under the files list table



