@All
Feature: Test Cases Page Verification
  As a user
  I want to verify the Test Cases page functionality
  So that I can ensure proper navigation to test cases

  Scenario: Verify navigation to Test Cases page
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on Test Cases button
    Then I verify that I am navigated to test cases page successfully