@regression @widget
Feature: This feature file tests Widget Page functionality

  Background:
    When user is in  BekHealth page

@widget1
  Scenario Outline: user validates widgets from Widget Page
    Given user enter valid credentials and clicks on login button
    Then user clicks the widget button
    Then user clicks "<widget>" page and verifies the text in page
  Examples:
  |widget|
  |Galileo|
  |Reporting|
  |Auto Recruiter|
  |Administration|

