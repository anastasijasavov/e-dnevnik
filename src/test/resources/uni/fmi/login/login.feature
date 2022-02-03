 
    
Feature: System entry
 
  Background: 
  	Given User opens a screen for login
  
  
  Scenario Outline:
  	When inputs username: "<username>"
  	And inputs pass: "<password>"
  	And clicks on login button
  	Then show message: "<message>"
  	
  	  Examples: 
      | username        | password   |  message            						 | 
      | anastasijasavov | p4ssw0rd   | Successful login                |
      | anastasijasavov |            | Enter password                  |
      |                 | p4ssw0rd   | Enter username                  |
      |                 |            | Enter username and password.    |
      |  anastas        | p4ssw0rd   | Wrong username and/or password. |
      
      