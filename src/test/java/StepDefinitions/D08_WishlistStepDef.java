package StepDefinitions;

import Pages.P04_wishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;



public class D08_WishlistStepDef {

        P04_wishList p04_wishList = new P04_wishList(Hooks.driver);
        int num = 0;


    @When("user adds a product to wishlist")
    public void userAddsAProductToWishlist() {
        p04_wishList.selectThirdProductWishBtn();

    }

    @Then("wishlist notification message is visible")
    public void wishlistNotificationMessageIsVisible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(p04_wishList.barNotifySuccess.isDisplayed(),"the wishlist notification message is invisible");

    }

    @And("user gets the wishlist items number after adding product")
    public void userGetsTheWishlistItemsNumberAfterAddingProduct() {
        num = p04_wishList.getNumOfWishList();
    }

    @Then("number of wishlist items is increased")
    public void numberOfWishlistItemsIsIncreased() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(num >0 , "the item number didn't increased");
    }


}
