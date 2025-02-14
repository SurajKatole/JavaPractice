package Selenium;

import InterfacesInModernJava.Action;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        Actions actions = new Actions(driver);

        WebElement e = driver.findElement(By.id("button"));
        actions.click(e).perform();

        WebElement input = driver.findElement(By.id("input"));
        actions.sendKeys(input, "keys").perform();

        actions.moveToElement(e).perform();//hover over the element

        actions.moveToElement(e).click().perform();//moves to element and clicks it
        actions.contextClick(e).perform();// right click
        actions.doubleClick(e).perform();// double click

        actions.moveToElement(e).contextClick().perform(); //moves to element and right clicks it
        actions.moveToElement(e).doubleClick().perform(); //moves to element and double clicks it

        actions.dragAndDrop(e,input).perform(); // drags from e and drops at input

        //Composite actions
        actions.moveToElement(e).clickAndHold().moveToElement(input).release().perform();

        //build is used to compile all actions into one single action
        //perform executes them
        actions.moveToElement(e).clickAndHold().moveToElement(input).release().build().perform();

        //can perform key operations using actions
        //this action has no element passed
        // hence the select all will be performed on focused screen/element
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();




    }
}
