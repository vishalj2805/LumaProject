package pages;

import base.CommonActions;
import org.openqa.selenium.WebDriver;
import pageObjects.LandingPageObjects;

public class LandingPage {
    LandingPageObjects landingPageObjects;
    WebDriver driver;
    CommonActions commonActions;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        landingPageObjects = new LandingPageObjects();
        commonActions = new CommonActions(driver);
    }

    public void clickOnCreateAnAccountLink(){
        commonActions.click(landingPageObjects.createAnAccountLink);

    }

    public void clickOnSignInLink(){
        commonActions.click(landingPageObjects.signInLink);

    }

    public String getSignInWelcomeMessage(){
        return commonActions.getText(landingPageObjects.welcomeMessage);
    }


}
