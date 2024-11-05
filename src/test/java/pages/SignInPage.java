package pages;

import base.CommonActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.SignInPageObjects;
import pageObjects.SignUpPageObjects;

public class SignInPage {

    SignInPageObjects signInPageObjects;
    WebDriver driver;
    CommonActions commonActions;
    Logger logger;

    public SignInPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
        signInPageObjects = new SignInPageObjects();
        commonActions = new CommonActions(driver, logger);
    }


    public void enterEmail(String email){
        commonActions.enterText(email, signInPageObjects.email);
        logger.debug("Entered Email: " + email);
    }

    public void enterPassword(String password){
        commonActions.enterText(password, signInPageObjects.password);
        logger.debug("Entered Password: " + password);
    }

    public void clickOnSignInButton(){
        commonActions.click(signInPageObjects.signInButton);
        logger.debug("Clicked on Sign In Button: ");
    }


}
