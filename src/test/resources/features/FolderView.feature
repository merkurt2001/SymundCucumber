@folderview
Feature:
  Background: #@SYMU-470
    Given the user login with valid credentials

  Scenario: The user can change folder view order by Name
    And the user navigate to "files" page
    When the user click "Name" folder view button
    Then the user should be able to see changes order by "Name"

  Scenario: The user can change folder view order by Size
    And the user navigate to "files" page
    When the user click "Size" folder view button
    Then the user should be able to see changes order by "Size"

  Scenario: The user can change folder view order by Modified
    And the user navigate to "files" page
    When the user click "Modified" folder view button
    Then the user should be able to see changes order by "Modified"

  Scenario:
    And the user navigate to "files" page
    When the user click "Modified" folder view button
    Then the user should be able to see changes of folder view