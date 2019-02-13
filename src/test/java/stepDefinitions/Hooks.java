package stepDefinitions;


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
 public    static ChromeOptions options;
  public    static WebDriver myDriver;
    static ConfigFileReader cfr = new ConfigFileReader();

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\CloneProjects\\Facebook\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        myDriver = new ChromeDriver(options);
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Log.startTestCase("Scenario");

    }

    @After
    public void afterTest(){
        Log.endTestCase("Scenario");
        myDriver.quit();

    }
}
