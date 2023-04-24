package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scroll {
    WebDriver driver;
    public Scroll()  {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//img[@src='flags-normal/flag-of-India.png']")
    public WebElement flag;
    public void ActionsScroll() throws InterruptedException {
        Thread.sleep(10000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",flag);
    }
}
