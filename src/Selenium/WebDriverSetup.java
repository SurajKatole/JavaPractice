package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSetup {
    public static void main(String[] args) {
        //If not using WebDriverManager
        System.setProperty("webdriver.chrome.driver", "/Users/Suraj/downloads/chromedriver");

        //If using WebDriverManager
        //WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //deletes all cookies
        driver.manage().deleteAllCookies();

        //sets Implicit pageLoadTimeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //sets Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizes the browser window
        driver.manage().window().maximize();

        driver.get("www.google.com");

    }
}
