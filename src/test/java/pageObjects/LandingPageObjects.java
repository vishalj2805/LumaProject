package pageObjects;

import org.openqa.selenium.By;

public class LandingPageObjects {

    public By createAnAccountLink = By.xpath("//ul[@class='header links']/li[3]");
    public By signInLink = By.xpath("//ul[@class='header links']/li[2]");
    public By welcomeMessage = By.xpath("(//li[@class='greet welcome']/span)[1]");
}
