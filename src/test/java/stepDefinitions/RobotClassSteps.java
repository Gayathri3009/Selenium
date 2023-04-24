package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.RobotClass;

import java.awt.*;
import java.io.IOException;

public class RobotClassSteps {
    RobotClass robot=new RobotClass();

    public RobotClassSteps() throws AWTException, IOException {
    }
    @Given("User launches the website {string}")
    public void userLaunchesTheWebsite(String string) throws IOException {
        CommonMethods.GetURL(string);
    }


    @Then("User clicks on Courses box using robot class")
    public void user_clicks_on_courses_box_using_robot_class() throws InterruptedException, AWTException {
        robot.ClickCourses();
        robot.ActionsRobotClick();
    }



    }


