@calendar
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

  @SYMU-487
  Scenario Outline: User can create a new event <eventTitle> under the Calendar module and see it on the related day through the Monthly Calendar view
    When the user go to "Calendar" tab
    And the user click "View Section" button
    And the user click "Month" button
    And the user click "New Event" button
    And the user enter "<eventTitle>" to the Event Title
    And the user enter "<timeFrom>" date to "from" part
    And the user enter "<timeTo>" date to "to" part
    And the user click "Save" button from Event page
    Then the user can see "<eventTitle>" event on "<timeFrom>" Monthly Calendar view

    Examples:
      | eventTitle |  | timeFrom                    |  | timeTo                    |
      | Meeting 1  |  | from 08/29/2021 at 12:00 AM |  | to 08/29/2021 at 13:00 AM |
      | Meeting 2  |  | from 08/30/2021 at 12:00 AM |  | to 08/30/2021 at 13:00 AM |


  @SYMU-496
  Scenario: User can delete an event
    When the user go to "Calendar" tab
    And the user click "View Section" button
    And the user click "Month" button
    And the user click "New Event" button
    And the user enter "For_Deleting" to the Event Title
    And the user enter "from 08/28/2021 at 12.00 AM" date to "from" part
    And the user enter "to 08/28/2021 at 12.00 AM" date to "to" part
    And the user click "Save" button from Event page
    And the user click "For_Deleting" on "from 08/28/2021 at 12.00 AM" date
    And the user click "More" button from Event page
    And the user click "3 dot button" from created event
    And the user click "Delete" button from Event page
    Then the user can delete event "For_Deleting" on "from 08/28/2021 at 12.00 AM"




