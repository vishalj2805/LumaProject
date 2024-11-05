package pages;

import base.CommonActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    WebDriver driver;
    LandingPage landingPage;
    MyAccountPage myAccountPage;
    SignUpPage signUpPage;
    CommonActions commonActions;
    SignInPage signInPage;
    Logger logger;

    public PageObjectManager(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public LandingPage getLandingPage() {
        landingPage = new LandingPage(driver, logger);
        return landingPage;
    }

    public MyAccountPage getMyAccountPage() {
        myAccountPage = new MyAccountPage(driver, logger);
        return myAccountPage;
    }

    public SignUpPage getSignUpPage() {
        signUpPage = new SignUpPage(driver, logger);
        return signUpPage;
    }

    public SignInPage getSignInPage() {
        signInPage = new SignInPage(driver, logger);
        return signInPage;
    }

    public CommonActions getCommonActions() {
        commonActions = new CommonActions(driver, logger);
        return commonActions;
    }
}
