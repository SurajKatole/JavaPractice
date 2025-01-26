package Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        WebElement s = driver.findElement(By.id("Dropdown"));
        Select select = new Select(s);
        //Selecting options
        select.selectByVisibleText("Option1");
        select.selectByContainsVisibleText("on1");
        select.selectByIndex(1);
        select.selectByValue("1");

        //Deselecting options
        select.deselectAll();
        select.deselectByVisibleText("Option1");
        select.deSelectByContainsVisibleText("on1");
        select.deselectByIndex(1);
        select.deselectByValue("1");

        //fetching data
        select.getFirstSelectedOption();
        select.getAllSelectedOptions();
        select.getOptions();
        select.getClass();  //returns the runtime class of the Select object.
                            // It is a method inherited from the base Java Object class and can be used on any Java object.
        select.getWrappedElement(); // is used to retrieve the original WebElement that the Select object wraps around.
                                    // It gives you direct access to the <select> element in the DOM,
                                    // which the Select instance was created from.

    }
}
