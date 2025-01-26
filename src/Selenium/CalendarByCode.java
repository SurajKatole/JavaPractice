package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarByCode {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        //click on calendar data picker
        driver.findElement(By.id("date-picker")).click();

        //Ensure that calendar element is visible
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker")));

    }

    public static String[] splitDate(String dateVal)
    {
        return dateVal.split(" ");
    }

    public static void selectDateFromCalendar(String exMonth, String exYear, String exDay)
    {
        if(exMonth.equals("February") && Integer.parseInt(exDay)>29)
        {
            System.out.println("Wrong Date : " +exMonth+" : "+exDay );
            return;
        }
        else if(Integer.parseInt(exDay)>31)
        {
            System.out.println("Wrong Date : " +exMonth+" : "+exDay );
            return;
        }

        //Get Text from parent div where Month and Year is displayed
        String[] monthYearVal = splitDate(driver.findElement(By.className("ui-datepicker-title")).getText());

        while (!(monthYearVal[0].equals(exMonth)) && monthYearVal[1].equals(exYear))
        {
            //Click the next button to change the
            driver.findElement(By.xpath("//a[@title='Next']")).click();

            //Get Text from parent div where Month and Year is displayed
            monthYearVal = splitDate(driver.findElement(By.className("ui-datepicker-title")).getText());

        }

        //Click on the date value for the month and year required
        try {
            driver.findElement(By.xpath("//a[text()=" + exDay + "]")).click();
        }
        catch (Exception e)
        {
            System.out.println("Wrong Date : " +exMonth+" : "+exDay );
        }
    }


}
