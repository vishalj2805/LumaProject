package pages;

import base.CommonActions;
import org.openqa.selenium.WebDriver;
import pageObjects.MyAccountPageObject;

public class MyAccountPage {

    MyAccountPageObject myAccountPageObject;
    WebDriver driver;
    CommonActions commonActions;


    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        myAccountPageObject = new MyAccountPageObject();
        commonActions = new CommonActions(driver);
    }

    public void verifyAccountCreationSuccessMessage(){
        String actualText = commonActions.getText(myAccountPageObject.accountCreationSuccessMessage);
        System.out.println(actualText);
        commonActions.verifyText(actualText, "Thank you for registering with Main Website Store.");
    }
}
