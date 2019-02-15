package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.ConfigFileReader;
import utilities.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by balajakka on 25/01/2019.
 */
public class Hooks {

    public static WebDriver myDriver;
    public static ConfigFileReader cfr = new ConfigFileReader();
    public static ChromeOptions options;

    @Before
    public void beforeTest(Scenario scenario){
        options = new ChromeOptions();
//        options.addArguments("--start-maximized");
        options.addArguments("--kiosk");
        System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver");
        myDriver = new ChromeDriver(options);
//        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Log.startTestCase(scenario.getName());

    }

    @After
    public void afterTest(){
        Log.endTestCase("Scenario");
        myDriver.quit();

    }
}
