package StepDefinitions;

import Pages.P02_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef {
    P02_login p02_login = new P02_login(Hooks.driver);

    @Given("user navigates to the website")
    public void userNavigatesToTheWebsite() {
        SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"),
               "the current page is not the home page");
       softAssert.assertAll();
    }

    @And("user clicks on the login tab button")
    public void userClicksOnTheLoginTabButton() {
        p02_login.LoginTaskBar.click();
    }

    @And("user fills Email{string} and Password{string}")
    public void userFillsEmailAndPassword(String arg0, String arg1) {
        p02_login.fillsLogEmailPswrd(arg0,arg1);
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        p02_login.lgBtn.click();
    }

    @Then("user successfully login in the website")
    public void userSuccessfullyLoginInTheWebsite() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),("https://demo.nopcommerce.com/"));
        softAssert.assertTrue(p02_login.myAccTskBar.isDisplayed(),"the \"my account\" is not displayed ");

        softAssert.assertAll();
    }

}
