package pages;

import base.CommonActions;
import org.openqa.selenium.WebDriver;
import pageObjects.SignInPageObjects;
import pageObjects.SignUpPageObjects;

public class SignInPage {

    SignInPageObjects signInPageObjects;
    WebDriver driver;
    CommonActions commonActions;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        signInPageObjects = new SignInPageObjects();
        commonActions = new CommonActions(driver);
    }


    public void enterEmail(String email){
        commonActions.enterText(email, signInPageObjects.email);
    }

    public void enterPassword(String password){
        commonActions.enterText(password, signInPageObjects.password);
    }

    public void clickOnSignInButton(){
        commonActions.click(signInPageObjects.signInButton);
    }


}
