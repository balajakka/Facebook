package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;
import utilities.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by balajakka on 25/01/2019.
 */
public class Hooks {

    public static WebDriver myDriver;
    public static ConfigFileReader cfr = new ConfigFileReader();

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\Facebook\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver");
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Log.startTestCase("Scenario");

    }

    @After
    public void afterTest(){
        Log.endTestCase("Scenario");
        myDriver.quit();

    }
}
