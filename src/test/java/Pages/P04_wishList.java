package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P04_wishList {

    WebDriver driver;


    public P04_wishList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement barNotifySuccess;
    @FindBy(css = "span[class=\"wishlist-qty\"]")
    public WebElement NumOfWishList;

    public void selectThirdProductWishBtn()
    {
        driver.findElements(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
    }

    public int getNumOfWishList()
    {
        String str = NumOfWishList.getText().replaceAll("[^0-9]" , "");
        return Integer.parseInt(str);
    }

}
