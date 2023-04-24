package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload {
    WebDriver driver;
    public Upload()  {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//input[@id='input-4']")
    public WebElement upload;
    public void ActionsUpload() throws InterruptedException {

        Thread.sleep(10);
        upload.sendKeys("C://Users//HXKRISHG//Downloads//parrots_183609//parrots.jpg");

    }
}
