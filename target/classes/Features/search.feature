#Example for Data Table
Feature: Search Functionality

Scenario: Search Cruise Scenario

Given  user must be on homepage
When user must be on Crusies tab
Then User enters source and destination
| Mexico | May 2019 |
Then User enter No. of Travelers
Then User click search button
Then Close the browser