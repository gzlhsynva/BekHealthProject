@regression @galileo
Feature: This feature file tests Galileo Page functionality

  Background:
    When user is in  BekHealth page

  @galileo1
  Scenario: user validates Galileo Page trial criteria functionality
    Given user enter valid credentials and clicks on login button
    When user navigates to Galileo Page
    Then user adds options to the box
    And user clicks on save and validates the trial criteria

  @galileo2
  Scenario: user validates Galileo Page search functionality
    Given user enter valid credentials and clicks on login button
    When user navigates to Galileo Page
    Then user clicks Saved Trials and Criteria tab
    Then user uses the search button and verifies the result

#  @galileo3
#  Scenario: user validates Galileo Page patients in trial functionality
#    Given user enter valid credentials and clicks on login button
#    When user navigates to Galileo Page
#    Then user clicks the show patients in trial button and adds a new trial
#    And user verifies the trial functionalities and returns back
