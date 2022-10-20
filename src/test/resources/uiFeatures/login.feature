@regression @login @new
Feature: This feature file tests Login Page functionality

  Background:
    When user is in  BekHealth page

  @login1
  Scenario Outline: user should login to BekHealth

    Then user enters "<username>" and "<password>"
    And user validates the "<errorMessage>" after pressing sign in
    Examples:
      |username|password|errorMessage|
      |valid   |valid   |            |
      |valid   |invalid |Access denied: Wrong email or password|
#      |empty   |valid   |Please input email address|
      |valid   |empty   |Please input password     |







