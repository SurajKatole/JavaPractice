package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {
    static WebDriver driver= new ChromeDriver();
    public static void main(String[] args) {
        //text()
        driver.findElement(By.xpath("//a[text()='Features']"));
        driver.findElement(By.xpath("//a[contains(text(),'Features')]")); //-- recommended

        //and
        driver.findElement(By.xpath("//button[@type='button' and @class='btn']"));

        //parent
        driver.findElement(By.xpath("//button[@type='button']//parent::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']"));

        //preceding-sibling
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//preceding-sibling::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//preceding-sibling::td[@class='datarow']"));

       //following-sibling
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//following-sibling::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//following-sibling::td[@class='datarow']"));


    }
}
