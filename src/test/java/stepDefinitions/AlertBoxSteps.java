package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.AlertBox;
import org.example.CommonMethods;

import java.io.IOException;

public class AlertBoxSteps {
    AlertBox alert =new AlertBox();
    public AlertBoxSteps() throws IOException{
    }
    @Given("I launch {string} URL")
    public void iLaunchURL(String string) throws IOException {
        CommonMethods.GetURL(string);
    }



    @And("User clicks on the Alertbox")
    public void userClicksOnTheAlertbox() throws InterruptedException {
        alert.Clickalertbox();
    }



}
