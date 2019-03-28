Feature:  login test feature

#scenario without Examples keyword
#Scenario: login test scenario
#
#Given User must be on facebook login page
#When title of login page is facebook
#Then enter username and password
#Then user clicks on login button
#Then User on home page


#Scenario: login test scenario
#
#Given User must be on facebook login page
#When title of login page is facebook
#Then enter "rajandhandapani2@gmail.com" and "vettri180507"
#Then user clicks on login button
#Then User on home page

Scenario Outline: login test scenario

Given User must be on facebook login page
When title of login page is facebook
Then enter "<username>" and "<password>"
Then user clicks on login button
Then User on home page
Then user logout
Then close the browser
Examples:
	| username | password|
	| rajandhandapani2@gmail.com | vettri180507 |
