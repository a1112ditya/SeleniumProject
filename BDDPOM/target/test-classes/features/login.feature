Feature: Login Function

#Scenario: Login test Scenario
#Given User is aleady on login page
#When User enters "aditya.grkist@gmail.com" and "Bhau@2021"
#Then User is on Home Page
#Then Close the browser

#Scenario: Login test Scenario
#Given User is aleady on login page
#When User enters login credentials
#Then User is on Home Page
#Then Close the browser

#Scenario Outline:Login test Scenario
#Given User is aleady on login page
#When User enters <username> and <password>
#Then User is on Home Page
#Then Close browser

#Examples:
 # | username | password |
  #| 'aditya.grkist@gmail.com' | 'Bhau@2021' |
  #| 'welcome1' | 'test' |
  
  
  
Scenario: Login test Scenario
Given User is aleady on login page
When User enters login credentials
| username | password |
| aditya.grkist@gmail.com | Bhau@2021 |
Then User is on Home Page
Then Close the browser