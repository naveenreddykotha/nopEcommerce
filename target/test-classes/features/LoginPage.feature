
Feature: Verifying login funtionality of a website

Scenario Outline: Verify User is successfully logged into website
Given User is landed on nopecommerce page
When user logging with parameters "username" and "password"
Then verify user's first name with "Naveen Reddy"
And user need to logout from website

Examples:
|         username     |   password    | 
| naveen777@gmail.com  |    Naveen#777 |
|  naveen123@gmail.com |    Naveen@123 | 