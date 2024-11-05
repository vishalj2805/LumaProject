package pages;

import base.CommonActions;
import base.ContextSetup;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.LandingPageObjects;
import utilities.LoggerConfig;

import java.io.IOException;

public class LandingPage {
    LandingPageObjects landingPageObjects;
    WebDriver driver;
    CommonActions commonActions;
    Logger logger;


    public LandingPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        landingPageObjects = new LandingPageObjects();
        commonActions = new CommonActions(driver, logger);
        this.logger = logger;
    }

    public void clickOnCreateAnAccountLink(){
        commonActions.click(landingPageObjects.createAnAccountLink);
        logger.debug("Clicked on Create An Account Link");

    }

    public void clickOnSignInLink(){
        commonActions.click(landingPageObjects.signInLink);
        logger.debug("Clicked on Sign In Link");


    }

    public String getSignInWelcomeMessage(){
        String text = commonActions.getText(landingPageObjects.welcomeMessage);
        logger.debug("Fetched Text: " + text);
        return text;
    }


}
