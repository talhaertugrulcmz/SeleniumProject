package com.testinium.seleniumproject.methods;

import com.testinium.seleniumproject.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    Logger logger = LogManager.getLogger(Methods.class);


    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
        logger.info("Sendkeys işlemi başarıyla gerçekleşti hayırlı olsun");
    }

    public boolean isElementVisible(By by) {
        try {
            logger.info("True bro adamsınn ");
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        }catch (Exception e) {
            logger.info("False be kanki   " + e.getMessage());
            return false;
        }
    }
    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public Select getSelect(By by){

        return new Select(findElement(by));
    }
    public void selectByText(By by,String text){

        getSelect(by).selectByVisibleText(text);
    }
    public void scrollWithJavaScript(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));
    }

    public String getAttribute(By by,String attirubuteName){

        return findElement(by).getAttribute(attirubuteName);
    }

    public String getText(By by){

        return findElement(by).getText();
    }

    public void hoverElement(By by) {
        Actions action = new Actions(driver);
        logger.info("True"+ by);
        action.moveToElement(findElement(by)).build().perform();

    }
    public void randomPick(By by) {
        Random random = new Random();
        random.nextInt();
    }
}







