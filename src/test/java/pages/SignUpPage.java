package pages;

import base.CommonActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.SignUpPageObjects;

public class SignUpPage {

    SignUpPageObjects signUpPageObjects;
    WebDriver driver;
    CommonActions commonActions;
    Logger logger;

    public SignUpPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        signUpPageObjects = new SignUpPageObjects();
        commonActions = new CommonActions(driver, logger);
        this.logger = logger;
    }

    public void enterFirstName(String firstName){
        commonActions.enterText(firstName, signUpPageObjects.firstName);
        logger.debug("Entered First Name: " + firstName);
    }

    public void enterLastName(String lastName){
        commonActions.enterText(lastName, signUpPageObjects.lastName);
        logger.debug("Entered Last Name: " + lastName);
    }

    public void enterEmail(String email){
        commonActions.enterText(email, signUpPageObjects.email);
        logger.debug("Entered Email: " + email);
    }

    public void enterPassword(String password){
        commonActions.enterText(password, signUpPageObjects.password);
        logger.debug("Entered Password: " + password);
    }

    public void enterConfirmPassword(String confirmPassword){
        commonActions.enterText(confirmPassword, signUpPageObjects.confirmPassword);
        logger.debug("Entered Confirm Password: " + confirmPassword);
    }

    public void clickOnCreateAnAccountButton(){
        commonActions.click(signUpPageObjects.createAnAccountButton);
        logger.debug("Clicked on Create An Account Button: ");
    }




}
