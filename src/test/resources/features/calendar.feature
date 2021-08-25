Feature: Calendar
  Background:
    Given the user login with valid credentials

   @SYMU-471
      # When the user navigate to {string} page --> did not work for me. So I used go to tab...
  Scenario: User can display daily calendar view
    When the user go to "Calendar" tab
    And the user click "View Section" button
    And the user click "Day" button
    Then the user can display "daily" calendar view

