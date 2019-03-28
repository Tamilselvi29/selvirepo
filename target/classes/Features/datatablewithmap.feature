#example for datatable with map
Feature: datatable with map functionality

Scenario: Addition of two numbers with different data
Given I enter number1 and number2
|FirstNo | SecondNo |
| 10| 20 |
|50 | 30 |
When I add two numbers
Then I print the result


