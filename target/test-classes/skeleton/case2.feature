Feature:Signup process
Scenario Outline:Test the login functionality with different set of inputs
Given user enters the un as "<username>"
And password as "<password>"
Then click on login button
And verify successful login


Examples:
|username|password|
|AlexUser|Alex@123|
