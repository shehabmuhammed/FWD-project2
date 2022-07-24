@smokeTesting

Feature: F01 | user could register with valid data successfully

  Scenario: user could register with valid data successfully

    When register button are clicked
    Then user goes to the register tab successfully

#   Personal Details Form
    And user click on "male" option
    And user fills the "first" and "last_name" fields
    And user selects his birthday date ("20","10","1999")
    And user fills "automation@gmail.com" field

##   Company Name Field
    And user fills company name "Automation Company" field
#
#   Personal Password Field
    And user fills the Password"P@ssw0rd"
    And user fills the Conformation Password"P@ssw0rd"

##    Clicking and Checking
    And user clicks the register button
    Then user successfully registers in the website
    And user clicks the continue button
