package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by balajakka on 27/01/2019.
 */
public class FacebookLoginPage2 {

    WebElement emailInput;
    WebElement pwdInput;
    WebElement loginButton;

    WebElement firstNameInput;
    WebElement surnameInput;

    public WebElement captureEmailInput(WebDriver driver){

        return driver.findElement(By.id("email"));

    }

    public WebElement capturepwdInput(WebDriver driver){

        return driver.findElement(By.id("pass"));

    }

    public WebElement captureLoginButton(WebDriver driver){

        return driver.findElement(By.id("loginButton"));

    }

    public void loginFacebook(String usr, String pwd, WebDriver driver){

        captureEmailInput(driver).sendKeys(usr);
        capturepwdInput(driver).sendKeys(pwd);
        captureLoginButton(driver).click();
    }


    public FacebookLoginPage2(WebDriver driver){
        emailInput = driver.findElement(By.id("email"));
        pwdInput = driver.findElement(By.id("pass"));
        firstNameInput = driver.findElement(By.id("u_0_j"));
        surnameInput = driver.findElement(By.id("u_0_l"));
        loginButton = driver.findElement(By.id("loginbutton"));

    }

    public void accessFacebookLoginPage(WebDriver driver){
        driver.get("https://www.facebook.com/");
    }

    public void enterEmailId(WebDriver driver, String emailId){
        emailInput.sendKeys(emailId);
    }

    public void assertFacebookLoginPage(WebDriver driver){
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));
    }

}
