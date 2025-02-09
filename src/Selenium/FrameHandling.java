package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        //Frames are part of a webpage
        //Browser -> WebPage -> Frames
        //Frames have index starting from 0
        //Frames have names eg.leftPanel

        //How to check if there is frame in a webpage
            //1. Right click on webpage( where no element is present)
            //   and check if there is an option "This Frame"
            //2. Right click on webpage( where no element is present)
            //   click on View Page Source and you will find <frame> tags


        WebDriver driver = new ChromeDriver();

        //switch to frame using index
        driver.switchTo().frame(0);

        //switch to frame using name
        driver.switchTo().frame("leftPanel");

        //You can use xpath/WebElement of frame to switch to it
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeId']"));
        driver.switchTo().frame(frame);

        //navigates to parent frame of currently focused frame
        //or if current frame in inside main document, it navigates to main doc
        //it moves focus only one level up
        driver.switchTo().parentFrame();

        //to move from nested frames to main document
        // returns to main document from any frame in focus
        driver.switchTo().defaultContent();



    }
}
