@smokeTesting
Feature: F09 | user chooses a product and adds to the shopping cart

  Scenario: user chooses a product and adds to the shopping cart
    When user clicks on a rondom product
    And user adds the product to the cart
    Then shopping cart notification message is visible

