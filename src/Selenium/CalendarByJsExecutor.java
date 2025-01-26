package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarByJsExecutor {
    static WebDriver driver= new ChromeDriver();
    public static void main(String[] args) {
        WebElement date = driver.findElement(By.id("date-picker-input"));
        String dateVal = "31-12-2024";

        selectDateByJS(driver,date,dateVal);
    }

    public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal)
    {
        //Casting your driver into JavascriptExecutor type
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);

    }
}
