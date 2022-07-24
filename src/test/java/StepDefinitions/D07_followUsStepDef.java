package StepDefinitions;

import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;


public class D07_followUsStepDef {

    P03_homePage p03_homePage = new P03_homePage(Hooks.driver);

    @When("user opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException {
        Thread.sleep(1000);
        p03_homePage.homeFacebookIcon.click();
        Thread.sleep(5000);
    }

    @Then("{string} is opened in a new tab")
    public void isOpenedInANewTab(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> windowTabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(windowTabs.get(1));
        Thread.sleep(8000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(p03_homePage.isTabOpened(arg0),"the specific tab is not opened");

        Hooks.driver.close();
        Hooks.driver.switchTo().window(windowTabs.get(0));

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        Thread.sleep(2000);
        p03_homePage.homeTwitterIcon.click();
        Thread.sleep(5000);
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        Thread.sleep(2000);
        p03_homePage.homeRssIcon.click();
        Thread.sleep(5000);
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        Thread.sleep(2000);
        p03_homePage.homeYoutubeIcon.click();
        Thread.sleep(5000);
    }

}
