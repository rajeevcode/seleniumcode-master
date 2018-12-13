# Each feature file contains one features
Feature: Login functionality of SDET university

  #Features has scenario
  Scenario: The user should be able to login with correct username and password
    Given user is on the login page
    When user enters correct username and password
    Then user gets confirmation
