@All1k
Feature: Verify address details in checkout page

  Scenario: Verify delivery and billing addresses during checkout
    Given I launch the browser
    And I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on Signup and Login button
    And I fill all details in Signup and create account
    Then I verify ACCOUNT CREATED! and click Continue button
    And I verify Logged in as username at top
    When I add products to cart
    And I click View Cart button
    Then I verify that cart page is displayed
    When I click Proceed To Checkout
    Then I verify that the delivery address matches registration details
    And I verify that the billing address matches registration details
    When I click Delete Account button
    Then I verify ACCOUNT DELETED! and click Continue button