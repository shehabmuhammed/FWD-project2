package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    WebDriver driver;

    public P02_login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "ico-login")
    public WebElement LoginTaskBar;


    @FindBy(id = "Email")
    public WebElement LoginEmail;
    @FindBy(id = "Password")
    public WebElement LoginPassword;


    public void fillsLogEmailPswrd(String email, String password){
        this.LoginEmail.sendKeys(email);
        this.LoginPassword.sendKeys(password);
    }


    @FindBy(css = "div[class=\"buttons\"] button[type=\"submit\"]")
    public WebElement lgBtn;


    @FindBy(className = "ico-account")
    public WebElement myAccTskBar;




}
