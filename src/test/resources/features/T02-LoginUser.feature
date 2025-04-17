@RegisterUser
Feature: User Login and Account Deletion
  As a user of Automation Exercise
  I want to login and delete my account
  So that I can manage my account security


  Scenario: Successful login and account deletion
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully

    When I click on Signup and Login button
    Then I verify that Login to your account is visible
    When I enter correct email address and password
    And I click login button
    Then I verify that Logged in as username is visible
    When I click Delete Account button
    Then I verify that ACCOUNT DELETED! is visible