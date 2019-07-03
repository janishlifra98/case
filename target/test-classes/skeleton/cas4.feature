Feature:Cart functionality
Scenario:User verifies whether the product is added to the cart or not
Given User opens the TestMeApp 
When the user gives the uname as "AlexUser"  and pasword as "Alex@123" 
And the user searches for the product
And moves to the cart without selecting any product
Then verify whether product is added to the cart or not