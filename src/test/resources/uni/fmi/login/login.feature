
Feature: System entry
	Background:
		Given User opens a screen for login

  Scenario: System entry with compatible login data
    
    When inputs username: "anastasijasavov"
    And inputs pass: "p4ssw0rd"
    And clicks on login button
    Then sees: "Successful login"
    
  Scenario: System entry with missing password
    When inputs username: "anastasijasavov"
    And clicks on login button
    Then sees: "Enter username and password."
    
  Scenario: System entry with missing username
    When inputs pass: "p4ssw0rd"
    And clicks on login button
    Then sees: "Enter username and password."
  
  Scenario: System entry with missing username and password
    When clicks on login button
    Then sees: "Enter username and password."
    
 Scenario: System entry with incompatible login data
    When inputs username: "Wrong username"
    And inputs pass: "p4ssw0rd"
    And clicks on login button
    Then sees: "Wrong username and/or password."