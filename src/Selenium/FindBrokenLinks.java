package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindBrokenLinks {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        driver.get("www.example.com");
        int brokenLinksCount =0;

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links)
        {
            String linkText = link.getDomAttribute("href");
            if(linkText==null || linkText.isEmpty())
            {
                brokenLinksCount++;
                continue;
            }
            try
            {
                HttpURLConnection connection = (HttpURLConnection) new URL(linkText).openConnection();
                connection.connect();
                if(connection.getResponseCode()>=400)
                {
                    brokenLinksCount++;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Number of broken links is : "+brokenLinksCount);
    }
}
