
Feature: Set grade
 
  Background: 
  	Given show grade form
  
  
  Scenario Outline: Teacher sets grade to a student
    When inputs students index: "<index>"
    And inputs grade: "<grade>"
    And inputs exam name: "<exam>"
    And inputs subject: "<subject>"
    And clicks submit button
		Then show message: "<message>"

    Examples: 
      | index      | grade | exam  |  subject   |  message               |
      | 1901111096 |     5 | Test2 | Mechanics  |  Success               | 
      | 1901111096 |     7 | Test2 | Mechanics  | Enter a valid grade    |
			| 1901111096 |       | Test2 | Mechanics  | Please enter a grade   |
			| 1901111096 |   4.5 | Test3 | Mechanics  | Enter a whole number   |
			| 1901222105 |   3   | Test2 | Mechanics  | Student doesnt exist   |
			
			      
