Feature: Orange Login Screen

@S1
Scenario Outline:: User Login 

Given Launch the browser 
And Open the Orange Application 
When User enters "<username>" and "<Password>"
Then Validate the Dashboard text in the orange Homepage


Examples:

|username|Password |
|admin   |admin123 |