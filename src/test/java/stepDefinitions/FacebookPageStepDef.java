package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FacebookLoginPage;
import utilities.Log;

import static stepDefinitions.Hooks.*;

/**
 * Created by balajakka on 24/01/2019.
 */
public class FacebookPageStepDef {

//    FacebookLoginPage2 flp;



    @Given("^I am chrome user$")
    public void Facebook_step1() {
        System.out.println("I am in given");
        Log.info("I am in Facebook step def");
    }

    @When("^I access facebook url$")
    public void Facebook_step2() {

        accessFacebook();
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
//        flp = new FacebookLoginPage2(myDriver);
        ScShot.capScrSht(myDriver,"screenShot");


    }

    @Then("^I see facebook login page$")
    public void Facebook_step3() {
//        flp.assertFacebookLoginPage(myDriver);
//        flp.enterEmailId(myDriver,"bala.jakka@icloud.com");
        FacebookLoginPage.assertEmailInputDisplayed();
        FacebookLoginPage.enterEmailInput("bala.jakka@icloud.com");

        FacebookLoginPage.myActions(myDriver);

//        FacebookLoginPage.selectDayFromDropdown("2");
//        FacebookLoginPage.selectMonthFromDropdown("3");
//        FacebookLoginPage.selectYearFromDropdown("1991");

    }

    public void accessFacebook(){
//        myDriver.get("https://www.facebook.com/");
        myDriver.get(cfr.getApplicationUrl());
//        "https://www.facebook.com/"

    }


}
