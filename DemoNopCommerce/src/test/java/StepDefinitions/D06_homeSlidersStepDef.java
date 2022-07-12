package StepDefinitions;


import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class D06_homeSlidersStepDef {

    P03_homePage p03_homePage = new P03_homePage(Hooks.driver);
    String str ;

    @When("user clicks on the slider {string}")
    public void userClicksOnTheSlider(String arg0) {
        p03_homePage.homeSliderSelect(arg0);
        str = arg0;
    }


    @Then("slider relative product page is displayed")
    public void sliderRelativeProductPageIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(p03_homePage.assertSlider(str) , " the slider product is not displayed");

    }
}
