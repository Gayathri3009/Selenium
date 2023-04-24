package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AlertBox {
    WebDriver driver;
    public AlertBox() throws IOException{
        this.driver=Driverfactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }

    public void Clickalertbox() throws InterruptedException {
        //Simple Alert
        driver.findElement(By.id("alertBox")).click();
        Alert simpleAlert=driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        Thread.sleep(3000);
        simpleAlert.accept();

        //Confirmation Alert
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmationAlert=driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        Thread.sleep(3000);
        confirmationAlert.accept();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();

        //Prompt Alert
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert=driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Gayathri");
        promptAlert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();


        }





    }



