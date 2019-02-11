package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Log;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static stepDefinitions.Hooks.myDriver;

/**
 * Created by balajakka on 05/02/2019.
 */
public class SantanderRetailStepDef {

    ArrayList<String> tabs2;

    Wait wait = new WebDriverWait(myDriver,10);

    WebElement aboutOnlineBankingLink;



    @When("^I access santander retail url$")
    public void santander_step2() throws InterruptedException {
        myDriver.get("https://retail.santander.co.uk/LOGSUK_NS_ENS/BtoChannelDriver.ssobto?dse_operationName=LOGON&dse_processorState=initial&redirect=S");

        if(myDriver.findElement(By.xpath("//div[@id ='splash-97123-body']")).isDisplayed()){
            myDriver.findElement(By.xpath("//div[@title='Close']")).click();
        }
        aboutOnlineBankingLink = (WebElement) wait
                .until(ExpectedConditions
                        .presenceOfElementLocated(By
                                .xpath("//a[text()='About Online Banking']")));

        myDriver.findElement(By.xpath("//a[text()='About Online Banking']")).click();

        tabs2 = new ArrayList<String> (myDriver.getWindowHandles());
        Log.info("I am in Santander step def");

        myDriver.switchTo().window(tabs2.get(0));

        sleep(10000);

        myDriver.switchTo().window(tabs2.get(1));

        myDriver.switchTo().window(tabs2.get(0));

        myDriver.findElement(By.xpath("//a[text()='Contact us']")).click();

        tabs2.add(myDriver.getWindowHandle());

        myDriver.switchTo().window(tabs2.get(2));

        for(String h: tabs2){
            myDriver.switchTo().window(h);
        }

    }
    @Then("^I see santander retail page$")
    public void santander_step3(){


    }




}
