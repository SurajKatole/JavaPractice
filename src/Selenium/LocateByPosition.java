package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocateByPosition {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        WebElement linkEle = driver.findElement(By.xpath("//div/a[contains(text(),'link']"));

        //Gets coordinates of an element in UI
        Point point = linkEle.getLocation();

        int x = point.getX();
        int y = point.getY();

        Actions actions = new Actions(driver);

        //Moves cursor to element using UI coordinates
        actions.moveByOffset(x,y).perform();

    }
}
