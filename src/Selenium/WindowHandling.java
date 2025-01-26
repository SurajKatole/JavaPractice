package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("www.google.com");

        Set<String> windows = driver.getWindowHandles(); //Returns all open windows(tabs) as Set of strings
        String currentWindow =  driver.getWindowHandle(); //Returns current open window(tab) as String

        //if only two windows(tabs) are open and have to switch to other window
        for(String s : windows)
        {
            driver.switchTo().window(s);
        }

        for(String s : windows)
        {
            //fail-safe that current window should not be switched to
            if(!s.equals(currentWindow))
            {
                driver.switchTo().window(s);
            }
        }

        //to open a new tab
        //-- using JavascriptExecutor
        ((JavascriptExecutor)driver).executeScript("window.open();");

        //--using Actions class
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
        //CTRL+t is keyboard shortcut for new tab

    }

}
