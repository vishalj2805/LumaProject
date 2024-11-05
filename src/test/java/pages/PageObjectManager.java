package pages;

import base.CommonActions;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    WebDriver driver;
    LandingPage landingPage;
    MyAccountPage myAccountPage;
    SignUpPage signUpPage;
    CommonActions commonActions;
    SignInPage signInPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        landingPage = new LandingPage(driver);
        return landingPage;
    }

    public MyAccountPage getMyAccountPage() {
        myAccountPage = new MyAccountPage(driver);
        return myAccountPage;
    }

    public SignUpPage getSignUpPage() {
        signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    public SignInPage getSignInPage() {
        signInPage = new SignInPage(driver);
        return signInPage;
    }

    public CommonActions getCommonActions() {
        commonActions = new CommonActions(driver);
        return commonActions;
    }
}
