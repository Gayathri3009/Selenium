package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class DropDown {

    WebDriver driver;
    public DropDown()  {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//select[@id='course']")
    public WebElement course;

    public void ClickCourse(){
        CommonMethods.ActionsClick(driver,course);
    }
    public void ActionsDropDown() throws InterruptedException {
        WebElement courseElement=driver.findElement(By.id("course"));
        Select courseNameDropDown=new Select(courseElement);
        List<WebElement>courseNameDropDownOptions=courseNameDropDown.getOptions();
        for (WebElement option:courseNameDropDownOptions){
            System.out.println(option.getText());
        }
        courseNameDropDown.selectByIndex(1);//Java
        Thread.sleep(3000);
        courseNameDropDown.selectByValue("net");//Dot Net
        Thread.sleep(3000);
        courseNameDropDown.selectByVisibleText("Javascript");//Javascript
        String selectedText=courseNameDropDown.getFirstSelectedOption().getText();
        System.out.println("Selected visible text-"+selectedText);
    }
}
