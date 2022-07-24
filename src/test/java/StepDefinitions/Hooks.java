package StepDefinitions;

import Pages.P01_register;
import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {

    // define before and after annotations for your driver
    public static WebDriver driver = null;

    @Before
    public static void open_Browser()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");

        P01_register p01_register = new P01_register(driver);
        P02_login p02_login =new P02_login(driver);
        P03_homePage p03_homePage = new P03_homePage(driver);

    }

    @After
    public static void close_Browser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
