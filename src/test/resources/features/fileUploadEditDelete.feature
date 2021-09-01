Feature: File upload/edit/delete fuctionality

  Background: Verify that the user is on the Dashboard page
    Given the user login with valid credentials
    Then the user on dashboard page

    Scenario: Verify that user can upload a file
      Given the user clicks on Files icon on the left top menu
      Then the user should be able to display the page whose title is Files - Symund - QA
      Given the user clicks on the + icon under the top menu
      Then the user should be able to display Upload file option
      When the user clicks on the Upload file button
      Then the user should be able to display Choose Files to Upload window




    Scenario: Verify that user can create a new folder



    Scenario: Verify that user can move or copy any selected item to any folder



    Scenario: Verify that user can delete any selected item



    Scenario: Verify that user can see the total number of files and folders under the files list table




