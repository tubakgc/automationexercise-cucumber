@RegisterUser
Feature: User Authentication
  As a registered user
  I want to login and logout
  So that I can securely access my account


  Scenario: Successful login and logout with valid credentials
    Given I launch the browser
    And I navigate to url automationexercise.com
    Then I verify that home page is visible successfully

    When I click on Signup and Login button
    Then I verify that Login to your account is visible
    When I enter correct email address and password
    And I click login button
    Then I verify that Logged in as username is visible

  When I click LogOut button
  Then I should be navigate to the login page