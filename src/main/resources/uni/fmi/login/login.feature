
Feature: System entry
  Scenario: System entry with compatible login data
    Given User opens a screen for login
    When inputs username
    And inputs pass
    And clicks on login button
    Then sees succesful login screen
    
  Scenario: System entry with missing password
    Given User opens a screen for login
    When inputs username
    And clicks on login button
    Then sees error message
    
  Scenario: System entry with missing username
    Given User opens a screen for login
    When inputs pass
    And clicks on login button
    Then sees error message
  
  Scenario: System entry with missing username and password
    Given User opens a screen for login
    When clicks on login button
    Then sees error message
    
 Scenario: System entry with incompatible login data
    Given User opens a screen for login
    When inputs wrong username
    And inputs pass
    And clicks on login button
    Then sees error message for wrong credentials