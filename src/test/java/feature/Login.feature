Feature: feature to test login functionality

Scenario Outline:: Check login successful with valid credential

Given user is on login page
When user enter <username> and <password>
And user click on login button
Then user is redirected to the homepage

Examples:
|username|password|
|Speedway2016|Speedway@2016|
|Ajinkya|12345|