@All
Feature: Product Search and Cart Verification

  Scenario Outline: Verify product search and cart persistence after login
    Given I launch the browser
    When I navigate to url automationexercise.com
    And I click on the Products button
    Then I should be navigated to the ALL PRODUCTS page
    When I enter "<products>" in search input and click search button
    Then I verify SEARCHED PRODUCTS is visible
    And I verify all the products related to search are visible
    When I add those products to cart
    And I click Cart button
    Then I verify that "<products>" are visible in cart
    When I click Signup-Login button and submit login details
    And I again go to Cart page
    Then I verify that those "<products>" are visible in cart after login as well

    #Aşağıdaki caseler logout yapan kullanıcının silinmesi için eklenmiştir.
    When I click Delete Account button
    Then I verify that ACCOUNT DELETED! is visible
    Examples:
      | products |
      | Saree    |