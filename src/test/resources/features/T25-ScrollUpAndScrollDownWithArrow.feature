@All
Feature: Verify Scroll Up and Scroll Down Functionality

  Scenario: Verify scroll using arrow button and scroll down
    Given I launch the browser
    And I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I scroll down to the bottom of the page
    Then I verify text SUBSCRIPTION
    When I click the scroll-up arrow button
    Then I scrolled up and the text Full-Fledged practice website for Automation Engineers' is visible