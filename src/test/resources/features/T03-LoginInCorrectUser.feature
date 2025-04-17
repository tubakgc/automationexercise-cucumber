@All
Feature: Login Functionality with Invalid Credentials
  As a user
  I want to verify the login functionality with incorrect credentials
  So that I can ensure the system properly handles invalid login attempts

  Scenario: Attempt to login with incorrect email and password
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on Signup and Login button
    Then I verify that Login to your account is visible
    When I enter incorrect email address and password
    And I click login button
    Then I verify error Your email or password is incorrect! is visible