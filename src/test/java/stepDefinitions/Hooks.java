package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by balajakka on 25/01/2019.
 */
public class Hooks {

    public static WebDriver myDriver;

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver");
        myDriver = new ChromeDriver();

    }

    @After
    public void afterTest(){
        myDriver.quit();

    }
}
