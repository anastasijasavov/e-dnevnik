
Feature: System entry
  Scenario: System entry with compatible login data
    Given User opens a screen for login
    When inputs username
    And inputs pass
    And clicks on login button
    Then sees succesful login screen
