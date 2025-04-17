@All
Feature: Register User with Existing Email
  Scenario: Attempt to register with an already registered email
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on Signup and Login button
    Then I verify that New User Signup! is visible
    When I enter name  and already registered email address
    And I click Signup button
    Then I verify error message Email Address already exist! is visible