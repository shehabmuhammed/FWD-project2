@smokeTesting
Feature: User can add products to the wishlist


  Scenario: user adds products to the wishlist
    When user adds a product to wishlist
    Then wishlist notification message is visible
    And  user gets the wishlist items number after adding product
    Then number of wishlist items is increased