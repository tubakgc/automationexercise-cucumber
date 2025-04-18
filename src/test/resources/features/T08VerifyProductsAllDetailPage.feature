@All
Feature: Product Page Verification
  As an e-commerce user
  I want to verify product listing and details
  So I can ensure proper product information display

  Scenario: Verify All Products and product detail page
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    And I click on the Products button
    Then I should be navigated to the ALL PRODUCTS page
    And I should see the products list

    When I click View Product for the first product
    Then I should be landed on the product detail page
    And I should verify the following product details: