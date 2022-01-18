@regression @administration
Feature: This feature file tests Administration Page functionality

  Background:
    When user is in  BekHealth page

  @administration1
  Scenario Outline: user validates Administration page
    When user enter valid credentials and clicks on login button
    Then user clicks the menu button and navigates to administration page and validates it
    Then user validates the "<subtabs>"
    Examples:
    |subtabs                |
    |Authentication          |
    |Site Registration       |
    |Trial Groups            |
