@Al
Feature: Search Products and Verify Cart After Login

  Scenario Outline: Search products and verify they remain in cart after login
    Given I launch the browser
    And I navigate to url automationexercise.com
    When I click on the Products button
    Then I should be navigated to the ALL PRODUCTS page
    When I enter "<product name>" in search input and click search button
    Then I verify SEARCHED PRODUCTS is visible
    And I verify all the products related to search are visible
    When I add those products to cart
    And I click Cart button
    Then I verify that products are visible in cart
    When I click on Signup and Login button
    And I enter incorrect email address and password
    And I go to Cart page again
    Then I verify that those products are visible in cart after login as well
    Examples:
      | product name |
      | Blue         |
      | Dress        |