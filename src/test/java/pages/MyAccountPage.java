package pages;

import base.CommonActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.MyAccountPageObject;

public class MyAccountPage {

    MyAccountPageObject myAccountPageObject;
    WebDriver driver;
    CommonActions commonActions;
    Logger logger;


    public MyAccountPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        myAccountPageObject = new MyAccountPageObject();
        commonActions = new CommonActions(driver, logger);
        this.logger = logger;
    }

    public void verifyAccountCreationSuccessMessage(){
        String actualText = commonActions.getText(myAccountPageObject.accountCreationSuccessMessage);
        commonActions.verifyText(actualText, "Thank you for registering with Main Website Store.");
    }
}
