Feature: Tasks

  Background:
    Given the user login with valid credentials

  @SYMU-186
  Scenario: User can create a new list of tasks
    When the user navigate to "tasks" page
    And the user clicks "Add List" button
    And the user clicks textbox and enter a list name
    Then the user creates new task list

  @SYMU-187
  Scenario: User can create a new task
    When the user navigate to "tasks" page
    And the user clicks one of the tabs under current on left panel
    And the user enters a new task name and press enter
    Then the user enters creates new task
