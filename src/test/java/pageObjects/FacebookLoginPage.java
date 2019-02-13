package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static stepDefinitions.Hooks.ScShot;
import static stepDefinitions.Hooks.myDriver;

/**
 * Created by balajakka on 25/01/2019.
 */
public class FacebookLoginPage {

    @FindBy(id = "email")
    static WebElement emailInput;

    @FindBy(id = "pass")
    static WebElement pwdInput;

    @FindBy(xpath = "//input[@name='firstname']")
    static WebElement firstNameInput;

    @FindBy(id = "u_0_l")
    static WebElement surnameInput;

    @FindBy(id = "loginbutton")
    static WebElement loginButton;

    @FindBy(xpath = "//select[@aria-label='Day']")
    static WebElement dayDropDown;

    @FindBy(xpath = "//select[@aria-label='Month']")
    static WebElement monthDropDown;

    @FindBy(xpath = "//select[@aria-label='Year']")
    static WebElement yearDropDown;

    @FindBy(xpath ="//a[contains(text(),'Forgotten')]" )
    static WebElement forgottenLink;


    public static void assertEmailInputDisplayed() {
        Assert.assertEquals(true, emailInput.isDisplayed());
    }


    public static void enterEmailInput(String emailId) {
        emailInput.sendKeys(emailId);
        ScShot.capScrSht(myDriver, "screenShot");
    }


    public static void selectDayFromDropdown(String dayString) {
        Select daySelect = new Select(dayDropDown);

        daySelect.selectByValue(dayString);
    }

    public static void selectMonthFromDropdown(String monthString) {
        Select monthSelect = new Select(monthDropDown);
//        monthSelect.selectByIndex(monthIndex);
        monthSelect.selectByValue(monthString);
    }

    public static void selectYearFromDropdown(String yearString) {
        Select yearSelect = new Select(yearDropDown);
//        monthSelect.selectByIndex(monthIndex);
        yearSelect.selectByValue(yearString);
//        yearSelect.selectByVisibleText(yearString);
//        System.out.println(yearSelect.selectByIndex(1));
    }

    //    public void checkDropDown(int i,String S,String D) {
//        daySelect.selectByIndex(i);
//
//       monthSelect.selectByValue(S);
//       yearSelect.selectByVisibleText(D);
//    }
    public static void myActions(WebDriver driver) {

        Actions actions = new Actions(driver);
        Action builder = actions
                .moveToElement(firstNameInput)
                .click()
                .sendKeys("BALA")
                .sendKeys(Keys.TAB)
                .sendKeys("JAKKA")
                .sendKeys(Keys.TAB)
                .sendKeys("07710234714")
                .build();
        builder.perform();

    }

    public void pwd(String S) {
        pwdInput.sendKeys(S);
        ScShot.capScrSht(myDriver, "screenShot");
    }

    public void click1() {
        // loginButton.click();
        //forgottenLink.click();


        // driver.navigate().back();
        ScShot.capScrSht(myDriver, "screenShot");
        Assert.assertEquals(true, myDriver.getTitle().contains("Facebook"));
        System.out.println("All Done");
    }
}

