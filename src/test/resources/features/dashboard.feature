@dashboard
Feature: Dashboard check

  Background:
    Given the user login with valid credentials

  Scenario: Dashboard
    When the user navigate to "photos" page
    Then the user on "photos" page

