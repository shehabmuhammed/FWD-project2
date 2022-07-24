package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P01_register {

    WebDriver driver;


    public P01_register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement RigButnTaskBar;
    @FindBy(id = "register-button")
    public WebElement RigButn;

    @FindBy(id = "gender-male")
    public WebElement RigGenMale;
    @FindBy(id = "gender-female")
    public WebElement RigGenFemale;

    public void genderRation(String gender)
    {
        switch (gender){
            case "male" :
                RigGenMale.click();
                break;
            case "female" :
                RigGenFemale.click();
                break;

            default:
                System.out.println("enter the word \"male\" or \"female\"");
        }
    }


    @FindBy(id = "FirstName")
    public WebElement RegistFirstName;
    @FindBy(id = "LastName")
    public WebElement RegistLastName;
    @FindBy(id = "FirstName-error")
    public WebElement RegistFirstNameError;
    @FindBy(id = "LastName-error")
    public WebElement RegistLastNameError;

    public void fillFirstAndLastNames(String frtname , String lstname)
    {
        RegistFirstName.sendKeys(frtname);
        RegistLastName.sendKeys(lstname);
    }


    public void selectDateOfBirth(String day , String month ,String year)
    {
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]  //option [@value="+day+"]")).click();  // from 13 to above
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]  //option [@value="+month+"]")).click();
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]  //option [@value="+year+"]")).click();// form 1912
    }


    @FindBy(id = "Company")
    public WebElement RigCompnyName;
    public void fillCompanyName(String name)
    {
        RigCompnyName.sendKeys(name);
    }


    @FindBy(id = "Email")
    public WebElement RigEmail;
    public void fillEmailField(String email)
    {
        RigEmail.sendKeys(email);
    }



    @FindBy(id = "Password")
    public WebElement RigPasswrod;
    public void fillPasswordField(String pw)
    {
        RigPasswrod.sendKeys(pw);
    }

    @FindBy(id = "ConfirmPassword")
    public WebElement RigConfPasswrod;
    public void fillConfPasswordField(String pw)
    {
        RigConfPasswrod.sendKeys(pw);
    }


    @FindBy(className = "result")
    public WebElement RigSuccess;
    public boolean getColorBtn()
    {
        return RigSuccess.getCssValue("color").equals("rgba(76, 177, 124, 1)");
    }



    @FindBy(xpath = "//div [@class=\"buttons\"] //a[@href=\"/\"]")
    public WebElement RigContinueButton;

}
