package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClass extends CommonMethods {
    WebDriver driver;
    public RobotClass() throws IOException {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }


    @FindBy(xpath = "//a[@class='ga_courses_click']")
    public WebElement courses;
    public void ClickCourses(){
        CommonMethods.ActionsClick(driver, courses);

    }

    public  void ActionsRobotClick() throws AWTException, InterruptedException {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println("a");
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println("b");
        robot.mouseMove(30,100);
        System.out.println("c");
    }









}
