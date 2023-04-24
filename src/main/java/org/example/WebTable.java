package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTable {
    WebDriver driver;
    public WebTable(){
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    public void ActionsWebTable() throws InterruptedException{
        WebElement table=driver.findElement(By.id("simpletable"));
        List<WebElement> headers=table.findElements(By.tagName("th"));
        for (WebElement header:headers){
            String text= header.getText();
            System.out.println(text);
        }
        List<WebElement>allrows=table.findElements(By.cssSelector("tbody tr"));
        int size =allrows.size();
        System.out.println("Rows size:"+size);
        if(size==3){
            System.out.println("Pass");

        }
        else System.out.println("False");
        for (WebElement rows:allrows){               //gets first column
            List<WebElement>columns= rows.findElements(By.tagName("td"));
            WebElement firstcolumn= columns.get(0);
            System.out.println(firstcolumn.getText());

        }
        for(int i=0;i<size;i++){                    //clicking specific checkbox
            List<WebElement>rows=allrows.get(i).findElements(By.tagName("td"));
            WebElement lastname= rows.get(1);
            String text= lastname.getText();
            System.out.println(text);
            if (text.equals("Chatterjee")){
                WebElement input=rows.get(3).findElement(By.tagName("input"));
                input.click();
            }

        }




    }
}
