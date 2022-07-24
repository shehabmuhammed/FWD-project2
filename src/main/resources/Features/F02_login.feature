@smokeTesting
Feature: F02 | user could Login with valid credentials

  Scenario:user could Login with valid credentials
#    check
    Given user navigates to the website

    And user clicks on the login tab button
#   Returning Customer
    And user fills Email"automation@gmail.com" and Password"P@ssw0rd"
    And user clicks on the login button

    Then user successfully login in the website
