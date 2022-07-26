package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P06_SearchPage {

        WebDriver driver;

        public P06_SearchPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

        public int productsList(){
            int size = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
            return size;
        }

        public WebElement noProducts(){
            return driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
        }
        
           public WebElement product() {
        return driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement assertion() {
        return driver.findElement(By.id("sku-4"));
    }
        
    }


