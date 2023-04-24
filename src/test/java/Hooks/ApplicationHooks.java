package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;

import org.example.Driverfactory;
import org.example.Propertyreader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks {
    WebDriver driver;
    Properties Prop;

    public ApplicationHooks() throws IOException {
        Propertyreader propertyreader=new Propertyreader();
        Prop = propertyreader.Reader();
    }


    @Before
    public void start()  {
        Driverfactory driverfactory=new Driverfactory();
        driver= driverfactory.driver_init(Prop.getProperty("BrowserType"));
        driver.manage().window().maximize();

    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException, InterruptedException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] file = FileUtils.readFileToByteArray(screenshot);
        scenario.attach(file, "image/png", "");

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}