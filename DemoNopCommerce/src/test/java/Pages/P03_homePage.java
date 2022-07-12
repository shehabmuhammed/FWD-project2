package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_homePage {
    WebDriver driver;

    public P03_homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void homeEuroUsDollar (String currency)
    {
        switch (currency){
            case "Euro" :
                driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]//option[@value][2]")).click();
                break;
            case "Us Dollar" :
                driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]//option[@value][1]")).click();
                break;
            default:
                System.out.println("the inputs are only \"Euro\" and \"Us Dollar\"");
        }
    }
    public boolean IsDisplayedEuroUsDollar (String currency)
    {
        switch (currency){
            case "Euro" :
               return driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]//option[@value][2]")).isDisplayed();
            case "Us Dollar" :
               return driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]//option[@value][1]")).isDisplayed();
            default:
                return false;
        }
    }



    @FindBy(id = "small-searchterms")
    public WebElement homeSearchField;
    @FindBy(css = "button[type=\"submit\"]")
    public WebElement homeSearchBtn;

    public void fillSearchField(String str)
    {
        this.homeSearchField.sendKeys(str);
    }

    public void clkButtonOrEnter(String str)
    {
        switch (str){
            case "click" :
                this.homeSearchBtn.click();
                break;
            case "enter" :
                this.homeSearchField.sendKeys(Keys.ENTER);
                break;
        }
    }


    public boolean isItSearchResult()
    {
        return driver.getCurrentUrl().equals("https://demo.nopcommerce.com/search?q=");
    }



    public void homeSliderSelect (String str)
    {
        int index =0 ;
        switch (str)
        {
            case "nokia":
                index = 1;
                break;
            case "iphone":
                index = 2;
                break;
        }
         driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]["+index+"]")).click();
    }


    public boolean assertSlider (String str)
    {
        switch (str)
        {
            case "nokia":
                return driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020");
            case "iphone":
                return driver.getCurrentUrl().equals("https://demo.nopcommerce.com/iphone_s6");
        }
        return false;
    }


    @FindBy(css = "ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]")
    public WebElement homeComputers;
    @FindBy(css = "ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]")
    public WebElement homeComputersDesktop;

    public boolean subcategoryPage()
    {
        return driver.getCurrentUrl().equals("https://demo.nopcommerce.com/desktops");
    }



    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement homeFacebookIcon;
    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement homeTwitterIcon;
    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement homeRssIcon;
    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement homeYoutubeIcon;


    public boolean isTabOpened (String str)
    {
        switch (str)
        {
            case "http://www.facebook.com/nopCommerce":
                return driver.getCurrentUrl().contains("http://www.facebook.com/nopCommerce");
            case "https://twitter.com/nopCommerce":
                return driver.getCurrentUrl().equals("https://twitter.com/nopCommerce");
            case "/news/rss/1":
                return driver.getCurrentUrl().equals("https://demo.nopcommerce.com/new-online-store-is-open");
            case "http://www.youtube.com/user/nopCommerce":
                return driver.getCurrentUrl().equals("http://www.youtube.com/user/nopCommerce");
        }
        return false;
    }

}
