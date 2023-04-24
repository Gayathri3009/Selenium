package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
    WebDriver driver;
    public Frames()  {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
@FindBy(xpath ="//input[@name='fname']" )
WebElement firstname;
    @FindBy(xpath="//input[@name='lname']")
    WebElement lastname;

    public boolean ActionsFrame() {

        try {

            driver.switchTo().frame(driver.findElement(By.id("firstFr")));
            boolean p = CommonMethods.isVisible(driver, firstname, 3);
            if (p) {
                firstname.sendKeys("Gayathri");

            }
            boolean d = CommonMethods.isVisible(driver, lastname, 3);
            if (d) {
                lastname.sendKeys("K");
            }

            return true;
        } catch (Exception e) {
              e.printStackTrace();
              return false;
        }
    }

    }



