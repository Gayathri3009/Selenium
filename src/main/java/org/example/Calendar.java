package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calendar {
    WebDriver driver;
    public Calendar()  {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    public void ActionsCalendar() throws InterruptedException {
        driver.findElement(By.id("datepicker")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
        String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYearVal);

        String month = monthYearVal.split(" ")[0].trim();
        String year = monthYearVal.split(" ")[1].trim();
        while (!(month.equals("June") && year.equals("2023"))) {

            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
            System.out.println(monthYearVal);
            month = monthYearVal.split(" ")[0].trim();
            year = monthYearVal.split(" ")[1].trim();
        }
        driver.findElement(By.xpath("//a[text()='23']")).click();
    }






}
