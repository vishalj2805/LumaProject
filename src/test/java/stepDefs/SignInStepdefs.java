package stepDefs;

import base.CommonActions;
import base.ContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.SignInPage;
import pages.SignUpPage;

public class SignInStepdefs {

    ContextSetup contextSetup;
    CommonActions commonActions;
    LandingPage landingPage;
    SignInPage signInPage;
    MyAccountPage myAccountPage;

    public SignInStepdefs(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        commonActions = contextSetup.pageObjectManager.getCommonActions();
        landingPage = contextSetup.pageObjectManager.getLandingPage();
        signInPage = contextSetup.pageObjectManager.getSignInPage();
        myAccountPage = contextSetup.pageObjectManager.getMyAccountPage();
    }

    @When("User clicks on Sign In Link")
    public void userClicksOnSignInLink() {
        landingPage.clickOnSignInLink();
    }

    @And("User is navigated to Sign In page")
    public void userIsNavigatedToSignInPage() {
        commonActions.verifyTitle("Customer Login");
    }

    @And("User enters Email {string} and password {string}")
    public void userEntersUsernameAndPassword(String email, String password) {
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);

    }

    @And("User clicks on Sign In Button")
    public void userClicksOnSignInButton() {
        signInPage.clickOnSignInButton();
    }


    @Then("Verify whether User is on Home Page")
    public void verifyWhetherUserIsOnHomePage() {
        commonActions.verifyTitle("Home Page");
    }

    @And("Welcome Message is displayed on Home Page")
    public void welcomeMessageIsDisplayedOnHomePage() {
        String welcomeMessage = landingPage.getSignInWelcomeMessage();
        commonActions.verifyContainsText(welcomeMessage, "Welcome");
    }
}
