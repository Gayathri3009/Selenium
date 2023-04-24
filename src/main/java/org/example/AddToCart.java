package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    WebDriver driver;
    public AddToCart() {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement samsungPhone;

    @FindBy(xpath="//input[@id='add-to-cart-button']")
    public WebElement addToCart;
    public boolean ActionsSend(){
        try{

         searchBox.sendKeys("samsung");
         return true;

}
        catch(Exception e){
            e.printStackTrace();
            return false;
        }}

        public boolean ActionsClick(){
            try{

        driver.findElement(By.id("nav-search-submit-button")).click();
        return true;

}
    catch(Exception e){
        e.printStackTrace();
        return false;

    }}


public boolean ActionsNavigate() {
            try {
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                javascriptExecutor.executeScript("arguments[0].click();",samsungPhone);
                CommonMethods.switchToTab(driver,2);
                  return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }}


    public boolean ActionsAdd () {
                try {
                    addToCart.click();
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }