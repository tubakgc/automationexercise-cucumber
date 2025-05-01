@All
Feature: Add to cart from Recommended items
  As a user
  I want to add products from Recommended items to my cart
  So that I can purchase popular items

  Scenario: Add a recommended product to cart and verify it appears in cart
    Given I launch the browser
    And I navigate to url automationexercise.com
    When I scroll to the bottom of the page
    Then I verify that RECOMMENDED ITEMS are visible
    When I click on Add To Cart on a recommended product
    And I click View Cart button
    Then I verify that cart page is displayed