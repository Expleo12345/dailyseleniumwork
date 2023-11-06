Feature: Login to OrangeHRM App
 
Scenario: Login with valid credentials in HRM
 
Given User is on OrangeHRM Login page
When User enters Correct username and password
And User clicks login
Then User should be able to login sucessfully