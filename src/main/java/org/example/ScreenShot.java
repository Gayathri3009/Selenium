package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    WebDriver driver;
    public ScreenShot() throws IOException {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//a[@id='navbtn_exercises']")
    public WebElement exercises;
    public void ClickExercises(){
        CommonMethods.ActionsClick(driver,exercises);
    }
    public void ActionsScreenShot() throws  IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils .copyFile(file,new File(".ScreenShots/Image1.png"));
        driver.quit();

    }

}
