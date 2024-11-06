package base;

import org.apache.log4j.Logger;
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
    Logger logger;

    public CommonActions(WebDriver driver, Logger logger) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        this.logger = logger;
    }


    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void enterText(String text, By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public void verifyTitle(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        logger.debug("Title Verified Successfully");
    }

    public void verifyText(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
        logger.debug("Text Verified Successfully");
    }

    public void verifyContainsText(String actualText, String expectedText) {
        if (actualText.contains(expectedText)) {
            logger.debug("Text Verified Successfully");
            assert true;
        } else {
            logger.debug("Text Verified Failed");
            assert false;
        }
    }

    public String getText(By locator) {
        wait.until(driver -> !driver.findElement(locator).getText().trim().isEmpty());
        logger.debug("Fetched Text: " + driver.findElement(locator).getText());
        return driver.findElement(locator).getText();
    }

}
