package pageObjects;

import org.openqa.selenium.By;

public class SignInPageObjects {

    public By email = By.xpath("//input[@id='email']");
    public By password = By.xpath("//input[@id='pass']");
    public By signInButton = By.xpath("//button[@class='action login primary']");

}
