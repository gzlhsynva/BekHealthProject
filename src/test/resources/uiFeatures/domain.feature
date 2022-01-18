@regression @domain
Feature: This feature file tests Domain Page functionality

  Background:
    When user is in  BekHealth page

@domain1
  Scenario Outline: user validates Domain Pages
    Given user enter valid credentials and clicks on login button
    When user navigates to Galileo Page
    Then user clicks on domain dropdown button and clicks each dropdown "<dropdowns>" and verifies the tabs

  Examples:
  |dropdowns                 |
  |Demographics              |
  |Custom facet              |
  |Observations & Vital Signs|
  |Diagnosis                 |
  |Encounters                |
  |Labs                      |
  |Medications               |
  |Procedures                |


