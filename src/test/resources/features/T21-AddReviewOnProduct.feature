@All
Feature: Product Review Submission

  Scenario: Submit and verify product review
    Given I launch the browser
    When I navigate to url automationexercise.com
    And I click on the Products button
    Then I click View Product for any product on home page
    When I click on View Product button
    Then I verify Write Your Review is visible
    When I enter name, email and review
    And I click Submite button
    Then I verify success message Thank you for your review.