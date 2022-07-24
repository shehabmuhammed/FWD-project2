package StepDefinitions;


import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;


import static StepDefinitions.Hooks.driver;


public class D03_currenciesStepDef {

    P03_homePage p03_homePage= new P03_homePage(driver);

    String check ;

    @When("user selects {string} from currency dropdown list")
    public void userSelectsFromCurrencyDropdownList(String arg0) {
        p03_homePage.homeEuroUsDollar(arg0);
        check = arg0;
    }

    @Then("user successfully change the currency")
    public void userSuccessfullyChangeTheCurrency() {


        int count = Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
        for (int x = 0; x < count; x++){
            String text = String.valueOf(p03_homePage.IsDisplayedEuroUsDollar(check));
            Assert.assertTrue(text.contains("€"));
        }
    }

}
