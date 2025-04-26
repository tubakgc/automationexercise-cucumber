@All
Feature: Remove Products From Cart
  As a user
  I want to remove products from my cart
  So that I can manage my shopping items


  Scenario: Remove a product from the shopping cart
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on the Products button
    When I add products to cart
    And I click View Cart button
    Then I verify that cart page is displayed
    When I click X button corresponding to a particular product
    Then I verify that the product is removed from the cart