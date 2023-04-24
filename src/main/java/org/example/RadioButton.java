package org.example;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RadioButton extends CommonMethods{
    WebDriver driver;

    public RadioButton() throws IOException {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@id='yesRadio']")
    public WebElement RadioButton;
    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement validateradiobutton;

    public void getHomepage() {
        Assert.assertTrue(validateradiobutton.isDisplayed());
    }

    public void clickradiobutton() throws InterruptedException {
        Thread.sleep(3000);
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("arguments[0].click();", RadioButton);
       CommonMethods.ActionsClick(driver,RadioButton);
    }
}
