@All
Feature: Product Search Functionality

  Scenario Outline: Verify product search functionality
    Given I launch the browser
    When I navigate to url automationexercise.com
    Then I verify that home page is visible successfully
    When I click on the Products button
    Then I should be navigated to the ALL PRODUCTS page
    When I enter "<product name>" in search input and click search button
    Then I verify SEARCHED PRODUCTS is visible
    And I verify all the products related to search are visible
    Examples:
      | product name |
      |Blue          |
      |Dress         |