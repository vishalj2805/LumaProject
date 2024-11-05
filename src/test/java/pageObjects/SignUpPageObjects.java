package pageObjects;

import org.openqa.selenium.By;

public class SignUpPageObjects {

    public By firstName = By.xpath("//input[@id='firstname']");
    public By lastName = By.xpath("//input[@id='lastname']");
    public By email = By.xpath("//input[@id='email_address']");
    public By password = By.xpath("//input[@id='password']");
    public By confirmPassword = By.xpath("//input[@id='password-confirmation']");
    public By createAnAccountButton = By.xpath("//button[@title='Create an Account']");
}
