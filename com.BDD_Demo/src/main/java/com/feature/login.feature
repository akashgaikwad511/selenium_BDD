Feature:  JBK Offline application

@JBK
Scenario Outline: login test

Given user should be on login page
When user enters "<uname>" and "<pass>"
Then user should be on home page

Examples:
|uname          |pass  |
|kiran@gmail.com|123456|
|akash@gmail.com|qwerty|
|amar@gmail.com |poikju|

@JBK
 Scenario: logo test
 
 Given user should be on login page
 Then user should see JBK logo