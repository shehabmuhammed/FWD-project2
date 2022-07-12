package StepDefinitions;

import Pages.P03_homePage;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage p03_homePage= new P03_homePage(Hooks.driver);

    @When("user searches for any product like {string} in the home page")
    public void userSearchesForAnyProductLike(String arg0) {
        p03_homePage.fillSearchField(arg0);
    }


    @And("user clicks on the search button or just press enter :{string} in the search field")
    public void userClicksOnTheSearchButtonOrJustPressEnterInTheSearchField(String arg0) {
        p03_homePage.clkButtonOrEnter(arg0);
    }


    @Then("user gets to the product page")
    public void userGetsToTheProductPage() {
        SoftAssert softAssert = new SoftAssert() ;

        softAssert.assertTrue(p03_homePage.isItSearchResult(),"the product search page didn't appear");


    }
}
