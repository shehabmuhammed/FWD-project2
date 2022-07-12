package StepDefinitions;

import Pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

    P01_register p01_register = new P01_register(Hooks.driver);;


    @When("register button are clicked")
    public void rgBtnClicked()
    {
        p01_register.RigButnTaskBar.click();
    }

    @Then("user goes to the register tab successfully")
    public void rgTabSuccess()
    {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/register?returnUrl=%2F"),"sc1.1");
        softAssert.assertAll();
    }


    @And("user click on {string} option")
    public void userClickOnOption(String arg0) {
        p01_register.genderRation(arg0);
    }

    @And("user fills the {string} and {string} fields")
    public void userFillsTheAndFields(String arg0, String arg1) {
        SoftAssert softAssert = new SoftAssert();
        p01_register.fillFirstAndLastNames(arg0 , arg1);

        if(arg0.equals("") || arg1.equals(""))
        {
            p01_register.RigButn.click();
            softAssert.assertTrue((arg0.equals(""))&&(p01_register.RegistFirstNameError.isDisplayed()),
                    "the message \"First name is required\" is not Displayed");
            softAssert.assertTrue((arg1.equals(""))&&(p01_register.RegistLastNameError.isDisplayed()),
                    "the message \"Last name is required\" is not Displayed");
        }


        softAssert.assertAll();
    }

    @And("user selects his birthday date \\({string},{string},{string})")
    public void userSelectsHisBirthdayDate(String arg0, String arg1, String arg2) {
       p01_register.selectDateOfBirth(arg0 , arg1  ,arg2);
    }

    @And("user fills company name {string} field")
    public void userFillsCompanyNameField(String arg0) {
        p01_register.fillCompanyName(arg0);
    }


    @And("user fills {string} field")
    public void userFillsField(String arg0) {
        p01_register.fillEmailField(arg0);
    }

    @And("user fills the Password{string}")
    public void userFillsThePassword(String arg0) {
        p01_register.fillPasswordField(arg0);
    }

    @And("user fills the Conformation Password{string}")
    public void userFillsTheConformationPassword(String arg0) {
        p01_register.fillConfPasswordField(arg0);
    }

    @And("user clicks the register button")
    public void userClicksTheRegisterButton() {
        p01_register.RigButn.click();
    }

    @Then("user successfully registers in the website")
    public void userSuccessfullyRegistersInTheWebsite() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(p01_register.RigSuccess.isDisplayed(),"the message \"Your registration completed\" is not displayed");
        //softAssert.assertTrue(p01_register.getColorBtn(),"the is not green \"rgba(76, 177, 124, 1)\"");

        softAssert.assertAll();
    }

    @And("user clicks the continue button")
    public void userClicksTheContinueButton() {
        p01_register.RigContinueButton.click();
    }

}
