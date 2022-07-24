package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_shoppingCart {
    WebDriver driver;

    public P05_shoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "button[class=\"button-1 add-to-cart-button\"]")
    public WebElement productAddCart;
    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement barNotifySuccess;



    public void selectFirstProductAddCartBtn()
    {
        driver.findElements(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]")).get(1).click();
    }

}
