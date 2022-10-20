@regression @homepage
Feature: This feature file tests Home Page functionality

  Background:
    When user is in  BekHealth page

  @homepage1
  Scenario: user validates table on Home page after login
    When user enter valid credentials and clicks on login button
    Then user validates the displayed table on Homepage


  @homepage2
  Scenario Outline: user uses the Candidate Look Up functionality
    When user enter valid credentials and clicks on login button
    Then user clicks the Candidate Look Up button and looks up "<candidates>" and then verifies the information
    Examples:
      |candidates         |
      |Caroline Johnson Guzman|


  @homepage3
  Scenario Outline: user uses the Phone number Look Up functionality
    When user enter valid credentials and clicks on login button
    Then user clicks the Phone number Look Up button and looks up "<phoneNum>" and then verifies the information
    Examples:
      |phoneNum         |
      |+1-901-977-1767x9350|

  @homepage4
  Scenario: user validates table and trial name functionalities on Home page
    When user enter valid credentials and clicks on login button
    Then user validates the displayed table on Homepage
    Then user clicks on a trial name and verifies its functionality

#  @homepage5
#  Scenario: user logs into BekHealth website with an admin account and checks its functionalities
#    When user enter valid credentials and clicks on login button
#    Then user clicks Auto Recruiter page from navigation
#    Then user validates the table that is present and the list of categories
#    Then user clicks the menu button and navigates to administration page and validates it
#    Then user navigates to Galileo Page
#    Then user validates Galileo Page

#  @homepage6
#  Scenario: user logs into BekHealth website with user account and checks its functionalities
#    When user enter valid user credentials and clicks on login button
#    Then user clicks Auto Recruiter page from navigation
#    And validates Auto Recruiter page
#    Then user clicks the menu button and navigates to administration page and validates it
#    And validates Administration page
#    Then user navigates to Galileo Page
#    Then user validates Galileo Page

