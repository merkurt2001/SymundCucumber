@smoke
Feature: Dashboard check

  Background:
    Given the user login with valid credentials

  Scenario Outline: Dashboard
    When the user navigate to "<navigatePageName>" page
    Then the user on "<assertPageName>" page
    Examples:
      | navigatePageName | assertPageName |
      | dashboard        | dashboard      |
      | files            | files          |
      | photos           | photos         |
      | activity         | activity       |
      | spreed           | spreed         |
      | mail             | mail           |
      | contacts         | contacts       |
      | circles          | circles        |
      | calendar         | calendar       |
      | notes            | notes          |
      | deck             | deck           |
      | tasks            | tasks          |

