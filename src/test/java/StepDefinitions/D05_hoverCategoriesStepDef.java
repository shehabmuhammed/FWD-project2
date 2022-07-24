package StepDefinitions;


import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class D05_hoverCategoriesStepDef {

    P03_homePage p03_homePage = new P03_homePage(Hooks.driver);
    Actions action = new Actions(Hooks.driver);
    String subCategoryName;


    @When("user hover category and select subcategory")
    public void userHoverCategoryAndSelectSubcategory() throws InterruptedException {

        action.moveToElement(p03_homePage.homeComputers).perform();
        Thread.sleep(1000);

        subCategoryName = p03_homePage.homeComputersDesktop.getText().toLowerCase().trim();
        System.out.println(subCategoryName);

        p03_homePage.homeComputersDesktop.click();
    }


    @Then("the subcategory is opened")
    public void theSubcategoryIsOpened() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(p03_homePage.subcategoryPage(),"the subcategory is not opened ");
    }
}
