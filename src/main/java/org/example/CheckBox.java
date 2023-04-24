package org.example;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CheckBox {

    WebDriver driver;

    public  CheckBox() throws IOException{
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(xpath = "//span[@class='rct-checkbox']")

    public WebElement Checkbox;

    @FindBy(xpath= "//div[@class='pattern-backgound playgound-header']")
    public  WebElement validatecheckbox;

    public void validhomepage() {
        Assert.assertTrue(validatecheckbox.isDisplayed());
    }


    public void clickcheckbox() {
        Checkbox.click();
    }
}