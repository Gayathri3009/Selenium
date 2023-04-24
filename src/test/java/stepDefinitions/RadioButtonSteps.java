package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.RadioButton;

import java.io.IOException;

public class RadioButtonSteps {
    RadioButton radio=new RadioButton();
    public RadioButtonSteps() throws IOException{

    }
    @Given("I launch Radiobutton URL")
    public void iLaunchRadiobuttonURL(String string) throws IOException {
        CommonMethods.GetURL(string);
    }
    @Then("User is navigated to the homepage of the RadioButton URL.")
    public void userIsNavigatedToTheHomepageOfTheRadioButtonURL() {
        radio.getHomepage();
    }
    @Then("User clicks on the Radiobutton")
    public void userclicksontheRadioButton() throws InterruptedException {
        radio.clickradiobutton();
    }


}
