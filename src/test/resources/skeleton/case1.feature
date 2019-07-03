Feature:Register test
Description:User registers using valid credentials
Scenario:Signup takes place with valid combination
Given user opens the testMeApp application
When the user opens the signup page
And the user gives  username as "kjhnu7" 
And the user gives the firstname as "pavi" 
And the user gives the lastname as "kavi" 
And the user gives the password as "passpass"
And the user gives the confirm password as "passpass"
And the user selects the gender as "female"
And the user gives the email as "pass@gmail.com"
And the user gives the mobile number as "7894561238"
And the user gives the dob as "25-5-1998"
And the user gives the confirm password as "passpass"
And the user gives the address as "parrys"
And the user selects the security question 
And the user gives the answer as "pat"
And click register button
Then verify register process




