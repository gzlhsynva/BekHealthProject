@regression @autoRecruiter
Feature: This feature file tests Auto Recruiter Page functionality

  Background:
    When user is in  BekHealth page

  @autoRecruiter1
  Scenario: user validates Auto Recruiter Page negative scenario
    Given user enter valid credentials and clicks on login button
    When user clicks "<Auto Recruiter>" page and verifies the text in page
    Then user adds a new trial and verifies it
    Then user confirms that the trial was not created

  @autoRecruiter2
  Scenario: user validates Auto Recruiter Page from navigation bar
    Given user enter valid credentials and clicks on login button
    When user clicks Auto Recruiter page from navigation
    Then user validates the table that is present and the list of categories

  @autoRecruiter3
  Scenario: user validates Auto Recruiter Page
    Given user enter valid credentials and clicks on login button
    When user clicks Auto Recruiter page from navigation
    Then user clicks on "Inactive Patients" button and verifies the page
    Then user clicks on a patient and verifies their data
    And  user makes the patient active and verifies it

