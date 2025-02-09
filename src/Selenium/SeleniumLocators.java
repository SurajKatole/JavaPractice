package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

    //WebDriver is an Interface
    //As its interface no object can be created of the same
    //Hence ChromeDriver class that implements WebDriver is used
    //Object/Instance of ChromeDriver is saved into WebDriver type/reference
    static WebDriver driver= new ChromeDriver();

    public static void main(String[] args) {

        //**** Difference between findElement and findElements ****//

            //findElement returns only one WebElement
            //It throws NoSuchElementException if element is not found

            //findElements returns a list of WebElements
            //It returns an empty list if no element is found



//-----//1. id  -- I
        //Unique locator -- by W3C standards
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("surajkatole@yahoo.com");
        //Reusable
        WebElement nextButton = driver.findElement(By.id("next-button"));
        nextButton.click();

        //Not reusable
        driver.findElement(By.id("login-username")).sendKeys("surajkatole@yahoo.com");

//-----//2. name -- I
        //Unique locator -- by W3C standards
        driver.findElement(By.name("username")).sendKeys("surajkatole@yahoo.com");
        driver.findElement(By.name("button")).click();

//-----//3. xpath --Extended HTML Path -- II
         //go to HTML DOM > r-click on element > copy xpath > replace * with element tag -- Easy way but not recommended
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("surajkatole@yahoo.com");
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

//-----//4. cssSelector -- II
        //go to HTML DOM > r-click on element > copy Selector  -- Easy way but not recommended
        driver.findElement(By.cssSelector("#login-username")).sendKeys("surajkatole@yahoo.com");
        driver.findElement(By.cssSelector("#next-button")).click();

//-----//5. linkText -- IV
        //Only applicable for links
        //All links are represented by <a> tag
        driver.findElement(By.linkText("Trouble Signing in?")).click();
        driver.findElement(By.linkText("Sign Up")).click();

//-----//6. partialLinkText -- V
        //Only applicable for links
        //NOT RECOMMENED TO USE -- USE ONLY IF LINK TEXT IS TOO LONG
        //CAN CONFUSE EXECUTION IF MORE ELEMENTS HAVE SAME PARTIAL TEXT
        driver.findElement(By.partialLinkText("Trouble")).click();
        driver.findElement(By.partialLinkText("Sign")).click();

//-----//7. className -- IV
        //Issue arises as most classes are used for multiple elements
        //Its not unique
        driver.findElement(By.className("phone-no")).sendKeys("0099887766");

//-----//8. tagName -- IV
        //Issue arises as dom contains multiple duplicate tags
        //Its not unique
        driver.findElement(By.tagName("div"));









    }


}
