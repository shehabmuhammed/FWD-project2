@smokeTesting
Feature:F04 | user could search using product name or sku


  Scenario: user could search using product name
#    When user clicks on the search field in the home page
    When user searches for any product like "nokia" in the home page
    And user clicks on the search button or just press enter :"click" in the search field
    Then user gets to the product page


  Scenario:  user could search using sku
#    When user clicks on the search field in the home page
    When user searches for any product like "AP_MBP_13" in the home page
    And user clicks on the search button or just press enter :"enter" in the search field
    Then user could search successfully with SKU
