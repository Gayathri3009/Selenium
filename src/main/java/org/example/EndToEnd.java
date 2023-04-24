package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {
    WebDriver driver;
    public EndToEnd() {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//button[@class='fc-button fc-cta-consent fc-primary-button']")
    public WebElement consentButton;
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;
    @FindBy(xpath="//input[@name='lastname']")
    public WebElement lastName;
    @FindBy(xpath="(//input[@name='sex'])[2]")
    public WebElement gender;
    @FindBy(xpath="(//input[@name='exp'])[2]")
    public WebElement experience;
    @FindBy(xpath="(//input[@type='text'])[3]")
    public WebElement date;
    @FindBy(xpath="//input[@value='Automation Tester']")
    public WebElement profession;
    @FindBy(xpath="//input[@value='Selenium IDE']")
    public WebElement seleniumFlavours;

    @FindBy(xpath="//button[@name='submit']")
    public WebElement button;
    @FindBy(xpath = "//a[@id = 'banner-accept']")
    public WebElement AcceptCookies;

    @FindBy(xpath="//input[@name='photo']")
    public WebElement photo;

    public boolean clickConsent() {
        try {
            CommonMethods.ClickingOnWebElement(driver, consentButton, 3);
            CommonMethods.ClickingOnWebElement(driver, AcceptCookies, 3);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        }

        public boolean FirstName(){
        try {
            CommonMethods.Scrolling(driver, 0, 50);
            firstName.sendKeys("Gayathri");
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        }

    public boolean LastName() {
        try {
            CommonMethods.Scrolling(driver, 0, 50);
            lastName.sendKeys("K");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Gender() {
        try {
            CommonMethods.ClickingOnWebElement(driver, gender, 2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Experience() {
        try {
            CommonMethods.ClickingOnWebElement(driver, experience, 2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Date() {
        try {
            CommonMethods.Scrolling(driver, 0, 50);
            date.sendKeys("30-09-2000");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Profession() {
        try {

            CommonMethods.ClickingOnWebElement(driver, profession, 2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Profile() throws InterruptedException {
        try {
            Thread.sleep(10);
            photo.sendKeys("C://Users//HXKRISHG//Downloads//parrots_183609//parrots.jpg");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Flavours() {
        try {
            CommonMethods.ClickingOnWebElement(driver, seleniumFlavours, 2);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Continents() throws InterruptedException {
        try {
            WebElement ddown = driver.findElement(By.name("continents"));
            Select select = new Select(ddown);
            select.selectByIndex(3);
            Thread.sleep(3);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean SeleniumCommands() throws InterruptedException {
        try {
            WebElement sdown = driver.findElement(By.name("selenium_commands"));
            Select select = new Select(sdown);
            select.selectByIndex(3);
            Thread.sleep(2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void Button() throws InterruptedException {

            button.click();
            Alert confirmationalert = driver.switchTo().alert();
            System.out.println(confirmationalert.getText());
            Thread.sleep(3);
            confirmationalert.accept();


        }
    }



