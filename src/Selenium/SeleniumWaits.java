package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumWaits {

    static WebDriver driver = new ChromeDriver();

    public static void implicitWaitSelenium()
    {
        //Implicit Wait
        //-- Global wait applied on WebDriver
        //-- Applicable for all scripts
        //-- Differs from Thread.sleep() - as it deals with elements whereas Thread.sleep() holds the execution for static time given
        //--Dynamic Wait

        //Implicitly wait will be applied on driver and whenever the driver is interacting with any WebElement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //If the page loaded in 2 secs, it will ignore the remaining 18 secs and start execution of scripts
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //You can change this implicitly wait anywhere in your code and it will reassign the new value to it
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

   public static void explicitlyWaitSelenium()
   {
       //Local wait which is used by creating Object of WebDriverWait
       //Expected conditions are passed that are to be satisfied within given time
       //If the conditions are not met within the time, TimeOutException is thrown
       //Timeout can be manipulated for each element

       WebElement element = driver.findElement(By.id("element"));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(element));
       element.click();

       new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
       element.getText();


       //Fluent Wait is a type of explicit wait
       //-- it provides polling option to provide duration after which the condition should be checked for the element
       //-- it also provides and option to ignore a specific or all exceptions until the timeout
       //-- it is accessed through FluentWait class and is saved in reference of Wait interface or the FLuentWait class
       //-- as other waits FluentWait also takes WebDriver as input parameter

       FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);

       Wait<WebDriver> fluent = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
                                        .pollingEvery(Duration.ofSeconds(5))
               .ignoring(NoSuchElementException.class);

       fluent.until(ExpectedConditions.visibilityOf(element));

       fluentWait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

       fluentWait.until(ExpectedConditions.visibilityOf(element));
   }
}
