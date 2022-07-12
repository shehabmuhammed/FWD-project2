package StepDefinitions;


import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static StepDefinitions.Hooks.driver;


public class D03_currenciesStepDef {

    P03_homePage p03_homePage= new P03_homePage(driver);
    Select select = new Select(driver.findElement(By.name("customerCurrency")));
    String check ;

    @When("user selects {string} from currency dropdown list")
    public void userSelectsFromCurrencyDropdownList(String arg0) {
        p03_homePage.homeEuroUsDollar(arg0);
        check = arg0;
    }

    @Then("user successfully change the currency")
    public void userSuccessfullyChangeTheCurrency() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(p03_homePage.IsDisplayedEuroUsDollar(check)," the currency is not selected");

        softAssert.assertAll();
    }


}
