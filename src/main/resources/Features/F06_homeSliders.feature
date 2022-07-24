@smokeTesting
Feature: F06_homeSliders | users will be able to open sliders in home page

  Scenario: first slider is clickable on home page
    When user clicks on the slider "nokia"
    Then slider relative product page is displayed


  Scenario: second slider is clickable on home page
    When user clicks on the slider "iphone"
    Then slider relative product page is displayed
