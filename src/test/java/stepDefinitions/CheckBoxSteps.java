package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.CheckBox;
import org.example.CommonMethods;

import java.io.IOException;

public class CheckBoxSteps {

    CheckBox check = new CheckBox();//object creation

    public CheckBoxSteps() throws IOException {
    }


    @Given("User goes to the checkbox url {string}")
    public void userGoesToTheCheckboxUrl(String string) throws IOException {
        CommonMethods.GetURL(string);
    }

    @Then("User is directly navigated to the Homepage of the checkbox url")
    public void userIsDirectlyNavigatedToTheHomepageOfTheCheckboxUrl() {
        check.validhomepage();

    }
    @And("User clicks on the checkbox on the webpage")
    public void userClicksOnTheCheckboxOnTheWebpage() {

        check.clickcheckbox();
    }


}
