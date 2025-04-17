@All
Feature: Contact Us Form Functionality
  As a user
  I want to be able to submit the Contact Us form
  So that I can communicate with the company

  Scenario: Successful submission of Contact Us form
    Given I launch the browser
    And I navigate to url automationexercise.com
    Then I verify that home page is visible successfully

    When I click on Contact Us button
    Then I verify GET IN TOUCH is visible

    When I enter name name, email, subject and message
    And I upload a file
    And I click Submit button
    And I click OK button

    Then I verify success message Success! Your details have been submitted successfully. is visible

    When I click Home button
    Then I verify that I landed to home page successfully