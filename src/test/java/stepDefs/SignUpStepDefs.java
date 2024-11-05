package stepDefs;

import base.CommonActions;
import base.ContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.SignUpPage;

import java.io.IOException;

public class SignUpStepDefs {

    ContextSetup contextSetup;
    CommonActions commonActions;
    LandingPage landingPage;
    SignUpPage signUpPage;
    MyAccountPage myAccountPage;

    public SignUpStepDefs(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        commonActions = contextSetup.pageObjectManager.getCommonActions();
        landingPage = contextSetup.pageObjectManager.getLandingPage();
        signUpPage = contextSetup.pageObjectManager.getSignUpPage();
        myAccountPage = contextSetup.pageObjectManager.getMyAccountPage();
    }

    @Given("User is on Landing Page")
    public void userIsOnLandingPage() throws IOException {
        contextSetup.testBase.goToLandingPage();
        commonActions.verifyTitle("Home Page");
    }

    @When("User clicks on Create an Account Link")
    public void userClicksOnCreateAnAccountLink() {
        landingPage.clickOnCreateAnAccountLink();
    }


    @And("User is navigated to Create New Customer Account page")
    public void userIsNavigatedToCreateNewCustomerAccountPage() {
        commonActions.verifyTitle("Create New Customer Account");
    }


    @And("User clicks on Create an Account Button")
    public void userClicksOnCreateAnAccountButton() {
        signUpPage.clickOnCreateAnAccountButton();
    }

    @Then("Verify Account creation Message is displayed")
    public void verifyAccountCreationMessageIsDisplayed() {
        myAccountPage.verifyAccountCreationSuccessMessage();
    }

    @And("Verify whether User is on My Account Page")
    public void verifyWhetherUserIsOnMyAccountPage() {
        commonActions.verifyTitle("My Account");
    }


    @And("User enters all the details {string}, {string}, {string} and {string} and Confirm Password in fields on Sign Up Page")
    public void userEntersAllTheDetailsAndAndConfirmPasswordInFieldsOnSignUpPage(String firstName, String lastName, String email, String password) {
        signUpPage.enterFirstName(firstName);
        signUpPage.enterLastName(lastName);
        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
        signUpPage.enterConfirmPassword(password);
    }
}
