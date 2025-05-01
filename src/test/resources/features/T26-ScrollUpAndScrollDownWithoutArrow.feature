@Allw
Feature: Verify Scroll Functionality Without Arrow Button

  Scenario: Verify scroll up/down without using arrow button
    Given I launch the browser
    And I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I scroll down to the bottom of the page
    Then I verify text SUBSCRIPTION
    When I manually scroll up to the top of the page
    Then I scrolled up and the text Full-Fledged practice website for Automation Engineers' is visible