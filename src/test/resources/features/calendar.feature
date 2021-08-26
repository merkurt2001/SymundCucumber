Feature: Calendar

  Background:
    Given the user login with valid credentials

  @SYMU-471
      # When the user navigate to {string} page --> did not work for me. So I used go to tab...
  Scenario Outline: User can display <displayType> calendar view
    When the user go to "Calendar" tab
    And the user click "View Section" button
    And the user click "<type>" button
    Then the user can display "<displayType>" calendar view

    Examples:
      | type  |  | displayType |
      | Day   |  | daily       |
      | Week  |  | weekly      |
      | Month |  | monthly     |

    @wip
    Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
      When the user go to "Calendar" tab
      And the user click "View Section" button
      And the user click "Month" button
      And the user click "New Event" button
      And the user enter "Meeting" to the Event Title
      And the user enter "27/08/2021" date to "from" part
      And the user enter "28/08/2021" date to "to" part


