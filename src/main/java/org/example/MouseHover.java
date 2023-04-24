package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MouseHover {
    WebDriver driver;
    public MouseHover() {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
   // @FindBy (xpath="//button[.='✕']")
   // public WebElement button;
    public void ActionsMouseHover(){
        //CommonMethods.ActionsClick(driver,button) ;
      WebElement ele=  driver .findElement(By.xpath("//button[text()='Automation Tools']"));
        Actions act=new Actions(driver );
        act.moveToElement(ele) . perform();
        List <WebElement >links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a" ));
        int total_count= links.size();
        for(int i=0;i<total_count ;i++){
            WebElement element=links.get(i);
            String text= element.getAttribute("innerHTML");
            System . out.println("Links name is"+text) ;
            if (text.equalsIgnoreCase("Appium") ){
                element.click();
                break;

            }
           // driver.quit();

        }
}
}

