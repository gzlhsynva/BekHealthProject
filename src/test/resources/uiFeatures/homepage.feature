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
    |Jimmy French       |
    |Mark Garcia        |


  @homepage3
  Scenario Outline: user uses the Phone number Look Up functionality
    When user enter valid credentials and clicks on login button
    Then user clicks the Phone number Look Up button and looks up "<phoneNum>" and then verifies the information
    Examples:
      |phoneNum         |
      |1257489191       |
      |1547515897       |
