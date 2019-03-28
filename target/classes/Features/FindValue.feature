Feature: Find the number provided is in between 3 to 6

Scenario Outline: provided number is between 3 to 6

Given User enters <number1>
When Checks that the <number1> is greater than 6 print too long
And Checks that the <number1> is lessthan 3 print too short
Then print the message is success

Examples:
|number1|
|7|
|1|
|5|


