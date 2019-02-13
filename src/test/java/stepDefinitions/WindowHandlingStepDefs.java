package stepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import utilities.Log;

import static stepDefinitions.Hooks.myDriver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


public class WindowHandlingStepDefs {

    Set<String> tabs;
    ArrayList<String> tabs2,tabs3;
    @Given("^Opening the Naukri Homepage$")
    public void WindowHandling_step1()
    {
        myDriver.get("https://www.naukri.com");
        String s = myDriver.getWindowHandle();
        tabs = myDriver.getWindowHandles();
        Log.info("I am in WindowHandling step def");
        for (String h : tabs)
        {
            if (h.equalsIgnoreCase(s))
            {
                myDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
                tabs.add(myDriver.getWindowHandle());
            }
            else
            {

                myDriver.switchTo().window(h);
                myDriver.close();
            }
        }
    }
    @When("^Opening multiple pages from Naukri Homepage$")
    public void WindowHandling_step2 () throws InterruptedException
    {
        tabs2 = new ArrayList<String> (myDriver.getWindowHandles());
        Thread.sleep(3000);
        myDriver.switchTo().window(tabs2.get(0));
        myDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a/div")).click();
        tabs = myDriver.getWindowHandles();
        tabs2.add(myDriver.getWindowHandle());
        tabs3 = new ArrayList<String> (myDriver.getWindowHandles());
        System.out.println("Set WindowHandles are "+tabs);
        System.out.println("Hi");
        System.out.println("Chakri");



        System.out.println("List WindowHandles after adding are "+tabs2);
        System.out.println("List WindowHandles are "+tabs3);
    }

    @Then("^Closing All Windows$")
    public void WindowHandling_step3 () throws InterruptedException {
        for(String h: tabs3)
        {
            myDriver.switchTo().window(h);
            Thread.sleep(5000);
            myDriver.close();
        }

    }


}
