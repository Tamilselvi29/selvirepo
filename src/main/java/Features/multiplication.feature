Feature: Multiplication 
#  I multiply two numbers 
  
  #example without Examples keyword
#	Scenario: multiply a and b 
#	  Given I have variable "10" and "5"
#      When I multiplication "10" and "5"
#      Then I display the Result
      
#example with Examples keyword      
Scenario Outline: multiply two numbers
	  Given I have variable "<variable1>" and "<variable2>"
      When I multiplication "<variable1>" and "<variable2>"
      Then I display the Result
Examples:
|variable1|variable2|
|10|5|