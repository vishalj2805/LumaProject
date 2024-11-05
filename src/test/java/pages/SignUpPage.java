package pages;

import base.CommonActions;
import org.openqa.selenium.WebDriver;
import pageObjects.SignUpPageObjects;

public class SignUpPage {

    SignUpPageObjects signUpPageObjects;
    WebDriver driver;
    CommonActions commonActions;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        signUpPageObjects = new SignUpPageObjects();
        commonActions = new CommonActions(driver);
    }

    public void enterFirstName(String firstName){
        commonActions.enterText(firstName, signUpPageObjects.firstName);
    }

    public void enterLastName(String lastName){
        commonActions.enterText(lastName, signUpPageObjects.lastName);
    }

    public void enterEmail(String email){
        commonActions.enterText(email, signUpPageObjects.email);
    }

    public void enterPassword(String password){
        commonActions.enterText(password, signUpPageObjects.password);
    }

    public void enterConfirmPassword(String confirmPassword){
        commonActions.enterText(confirmPassword, signUpPageObjects.confirmPassword);
    }

    public void clickOnCreateAnAccountButton(){
        commonActions.click(signUpPageObjects.createAnAccountButton);
    }




}
