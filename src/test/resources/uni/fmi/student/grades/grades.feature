
Feature: Students grades panel
Background: 
    Given Student is logged in

  Scenario: Show students grades for a subject
    When user clicks on subject
    Then show grades from subject: "subject"
