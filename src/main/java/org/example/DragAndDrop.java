package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DragAndDrop extends CommonMethods {
    WebDriver driver;
    public DragAndDrop() throws IOException {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//div[@id='box3']")
    public WebElement source;
    @FindBy(xpath="//div[@id='box103']")
    public WebElement target;
    public void DragAndDrop() throws InterruptedException {
        Thread.sleep(3000);
        CommonMethods.ActionsDragAndDrop(driver,source,target);
    }




}
//div[@id='draggable']