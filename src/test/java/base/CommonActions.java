package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommonActions {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         js = (JavascriptExecutor) driver;
    }

    public void scroll(){
        js.executeScript("window.scrollTo(0,500)");

    }


    public void click(By locator){
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void enterText(String text, By locator){
            wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public void verifyTitle(String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public void verifyText(String actualText, String expectedText){
        Assert.assertEquals(actualText,expectedText);
    }

    public void verifyContainsText(String actualText, String expectedText){
        System.out.println(actualText + " " + expectedText);
        if (actualText.contains(expectedText)){
            assert true;
        } else {
            assert false;
        }
    }
    
    public String getText(By locator){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        return driver.findElement(locator).getText();
    }

}
