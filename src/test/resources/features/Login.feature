Feature: Login functionality


  Scenario: Valid login
    Given user is on the login page
    When User enters valid credentials
    Then User is redirected to the dashboard