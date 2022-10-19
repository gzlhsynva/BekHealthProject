@regression  @selectYourReport
Feature: This feature file tests Select Your Report functionality

  Background:
    When user is in  BekHealth page

    @selectYourReport1
  Scenario Outline: user validates Select Your Report page
    Given user enter valid credentials and clicks on login button
    When user clicks "<Select Report>" page and verifies the title
    Then user validates "<Select Report>" pages

    Examples:
      |Select Report|
#      |Operational Report|
      |Operational Performance Report|
      |User Performance Report|

  @selectYourReport2
  Scenario Outline: user validates Select Your Report page
    Given user enter valid credentials and clicks on login button
    When user clicks "<Select Report>" page and validates the functionalities in each page

    Examples:
      |Select Report|
#      |Operational Report|
      |Operational Performance Report|
      |User Performance Report|
