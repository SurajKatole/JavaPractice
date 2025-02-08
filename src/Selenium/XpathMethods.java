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


        //******* XPATH AXES *******//

        //parent
        //---Selects the parent of the current node.
        driver.findElement(By.xpath("//button[@type='button']//parent::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']"));

        //preceding
        //---Selects all nodes before the current node in the document.
        driver.findElement(By.xpath("//h2/preceding::p"));
        driver.findElement(By.xpath("//h2/preceding::p[@class='navbar']"));


        //preceding-sibling
        //---Selects all siblings before the current node.
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//preceding-sibling::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//preceding-sibling::td[@class='datarow']"));

        //following
        //---Selects all nodes after the current node in the document.
        driver.findElement(By.xpath("//h2/following::p"));
        driver.findElement(By.xpath("//h2/following::p[contains(text(),'para')]"));

        //following-sibling
        //---Selects all siblings after the current node.
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//following-sibling::td"));
        driver.findElement(By.xpath("//button[@type='button']//parent::td[@class='navbar']//following-sibling::td[@class='datarow']"));


        //ancestor
        //---Selects all ancestors (parent, grandparent, etc.) of the current node.
        driver.findElement(By.xpath("//input[@id='username']/ancestor::div"));
        driver.findElement(By.xpath("//input[@id='username']/ancestor::div[@class='data']"));

        //ancestor-or-self
        //---Selects all ancestors + the current node itself.
        driver.findElement(By.xpath("//input[@id='username']/ancestor-or-self::div"));
        driver.findElement(By.xpath("//input[@id='username']/ancestor-or-self::div[@class='data']"));

        //child
        //---Selects all direct children of the current node.
        driver.findElement(By.xpath("//div[@class='container']/child::p"));
        driver.findElement(By.xpath("//div[@class='container']/child::p[contains(text(),'para')]"));

        //descendant
        //---Selects all child, grandchild, etc. of the current node.
        driver.findElement(By.xpath("//div[@id='main']/descendant::a"));
        driver.findElement(By.xpath("//div[@id='main']/descendant::a[contains(text(),'para')]"));

        //descendant-or-self
        //---Selects all descendants + the current node itself.
        driver.findElement(By.xpath("//div[@id='main']/descendant-or-self::a"));
        driver.findElement(By.xpath("//div[@id='main']/descendant-or-self::a[contains(text(),'para')]"));


        // XPATH for Tables //

//        Target	                    XPath
//        First <td> of First <tr>	    //table/tbody/tr[1]/td[1]
//        Last <td> of First <tr>	    //table/tbody/tr[1]/td[last()]
//        First <td> of Last <tr>	    //table/tbody/tr[last()]/td[1]
//        Last <td> of Last <tr>	    //table/tbody/tr[last()]/td[last()]
    }
}
