package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.DropDown;

import java.io.IOException;

public class DropDownSteps {
    DropDown drop=new DropDown();

    public DropDownSteps() throws IOException {
    }

    @Given("User goes to the DropDown url {string}")
    public void usergoestothedropdownurl(String string) throws IOException {
        CommonMethods.GetURL(string);

    }

    @Then("User clicks on DropDown menu")
    public void user_clicks_on_drop_down_menu() throws InterruptedException {
        drop.ClickCourse();
        drop.ActionsDropDown();
    }

}
