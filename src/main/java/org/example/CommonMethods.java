package org.example;

import io.cucumber.plugin.event.Node;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Target;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

public class CommonMethods {
    public static Properties Prop;

    public static void ActionsDragAndDrop(WebDriver driver, WebElement source,WebElement target) {
        Actions act = new Actions(driver);
        act.dragAndDrop(source,target).perform();}

        public static void JavaClick(WebDriver driver,WebElement element){
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();", element);
        }


    public static void ActionsClick(WebDriver driver,WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        builder.click(element).perform();
    }
    public static void SimpleAlert(WebDriver driver){
        Alert alert=driver.switchTo().alert();
        String text= alert.getText();
        System.out.println("Simple alert text"+text);
        alert.accept();
    }
    public static void PromptAlert(WebDriver driver, String text) throws InterruptedException {
        driver.switchTo().alert();
        driver.switchTo().alert().sendKeys(text);

    }

    //For Click Action
   public static void ClickingOnWebElement(WebDriver driver , WebElement element,long waitTimeInSeconds){
        WebDriverWait webwait=new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
        webwait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    //For SendKeys Action
    public void sendKeysOnWebElement(WebElement element,String text){
       element.click();
       element.clear();
       element.sendKeys(text);
    }
    //For Selecting from Dropdownlist
    public void selectByVisibleText(WebElement element,String text){
       Select select=new Select(element);
       select.selectByVisibleText(text);
   }
   public static void Scrolling(WebDriver driver,int x,int y){
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy("+x+","+y+")", "");
   }
   public static void scrollToElement(WebDriver driver,WebElement element){
        JavascriptExecutor je=(JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",element);
   }



   public static void switchToTab(WebDriver driver,int Tab){
       ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(Tab-1));
   }
   //Accepting Alert from UI
    public void acceptAlert(WebDriver driver){
       driver.switchTo().alert().accept();
    }
    public static void staleElementWait(WebDriver driver,WebElement element,int sec){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
    }

    public static boolean isVisible(WebDriver driver, WebElement element, int sec)
    {    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(element));
        return true;
    } catch (Exception e) {
        System.out.println(e);
        return false;
    }
    }


    public static void  GetURL(String urls) throws IOException {
         Prop= Propertyreader.Reader();
         String URL=Prop.getProperty("URL");

        switch (URL){

            case "Orange":
                Driverfactory.getdriver().get(Prop.getProperty("OrangeURL"));
                break;
            case "Calender":
                Driverfactory.getdriver().get(Prop.getProperty("CalenderURL"));
                break;
            case "Checkbox":
                //System.out.println(Prop.getProperty("CheckboxURL"));
                Driverfactory.getdriver().get(Prop.getProperty("CheckboxURL"));
                break;
            case "Radiobutton":
                Driverfactory.getdriver().get(Prop.getProperty("RadiobuttonURL"));
                break;
            case "Alerts":
                Driverfactory.getdriver().get(Prop.getProperty("AlertsURL"));
                break;
            case"Frames":
                Driverfactory.getdriver().get(Prop.getProperty("FramesURL"));
                break;

            case"DropDownMenu":
                Driverfactory.getdriver().get(Prop.getProperty("DropDownMenuURL"));
                break;

            case"DragDrop":
                Driverfactory.getdriver().get(Prop.getProperty("DragDropURL"));
                break;

            case"Webtables":
                Driverfactory.getdriver().get(Prop.getProperty("WebtablesURL"));
                break;

            case"Upload":
                Driverfactory.getdriver().get(Prop.getProperty("UploadURL"));
                break;

            case"Mousehover":
                Driverfactory.getdriver().get(Prop.getProperty("MousehoverURL"));
                break;

            case"Tutorialpoint":
                Driverfactory.getdriver().get(Prop.getProperty("TutorialpointURL"));
                break;
            case"RobotClass" :
                Driverfactory.getdriver().get(Prop.getProperty("RobotClassURL"));
                break;
            case"ScreenShot":
                Driverfactory.getdriver().get(Prop.getProperty("ScreenShotURL"));
                break;
            case"JavaScriptExecutor":
                Driverfactory.getdriver().get(Prop.getProperty("JavaScriptExecutorURL"));
                break;
            case"WindowHandle":
                Driverfactory.getdriver().get(Prop.getProperty("WindowHandleURL"));
                break;
            case"Scroll":
                Driverfactory.getdriver().get(Prop.getProperty("ScrollURL"));
                break;
            case"AddToCart":
                Driverfactory.getdriver().get(Prop.getProperty("AddToCartURL"));
                break;
            case "AmazonOrder":
                Driverfactory.getdriver().get(Prop.getProperty("AmazonOrderURL"));
                break;

        }

    }
}
