package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Set;

public class WindowHandle {
    WebDriver driver;

    public WindowHandle() throws IOException {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[@id='newWindowBtn']")
    public WebElement button;
    public void ClickButton(){
        CommonMethods.ActionsClick(driver,button);
    }
    public void ActionsWindowHandle() throws InterruptedException {
        String parentHandle= driver.getWindowHandle();
        System.out.println("parent window -"+parentHandle);
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String>handles=driver.getWindowHandles();
        for(String handle:handles){
            System.out.println(handle);
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
