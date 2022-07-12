@smokeTesting
Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
    When user opens facebook link
    Then "http://www.facebook.com/nopCommerce" is opened in a new tab


  Scenario: user opens twitter link
    When user opens twitter link
    Then "https://twitter.com/nopCommerce" is opened in a new tab


  Scenario: user opens rss link
    When user opens rss link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in a new tab


  Scenario: user opens youtube link
    When user opens youtube link
    Then "http://www.youtube.com/user/nopCommerce" is opened in a new tab
