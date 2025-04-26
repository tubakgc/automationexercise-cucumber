@All
Feature: View & Cart Brand Products
  As a user
  I want to view products by brand
  So that I can find products from specific brands

  Scenario: View products by different brands
    Given I launch the browser
    And I navigate to url automationexercise.com
    When I click on the Products button
    Then I verify that Brands are visible on left side bar
    When I click on any brand name
    Then I verify that I am navigated to the brand page
    And I verify that brand products are displayed
    When On left side bar, I click on any other brand link
    Then I verify that I am navigated to that brand page
    And I verify that I can see products for this brand