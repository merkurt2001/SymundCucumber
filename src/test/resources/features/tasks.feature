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
    Then the user created a new task

  @SYMU-188
  Scenario: User can add a task to the list of completed tasks
    When the user navigate to "tasks" page
    And the user clicks load all completed tasks button
    Then the user created a new task in completed tasks

  @SYMU-189
  Scenario: User can add a task to the list of important tasks
    When the user navigate to "tasks" page
    And the user clicks important tab
    Then the user created a new task in important tasks

  @SYMU-190 @wip
  Scenario: User can see the number of all uncompleted tasks next to the Current tab
    When the user navigate to "tasks" page
    And the user can see uncompleted tasks on right panel