
Feature: Set grade
 
  Background: 
  	Given teacher is logged in
    And clicks add grade button
  
  
  Scenario Outline: Teacher sets grade to a student
    When inputs students index: "<index>"
    And inputs grade: "<grade>"
    And inputs exam name: "<exam>"
    And inputs subject: "<subject>"
		Then show message: "<message>"

    Examples: 
      | index      | grade | exam  |   subject   |  message               |
      | 1901111096 |     5 | Test2 |  Mechanics  |  Success               | 
      | 1901321096 |     7 | Test2 |  Mechanics  | Enter a valid grade    |
			| 1901321096 |       | Test2 |  Mechanics  | Please enter a grade   |
			| 1901321096 |   4.5 | Test3 |  History    | Enter a whole number   |
			
			      
