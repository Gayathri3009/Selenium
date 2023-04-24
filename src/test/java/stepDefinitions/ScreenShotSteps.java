package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.ScreenShot;

import java.io.IOException;

public class ScreenShotSteps {
    ScreenShot screen=new ScreenShot();

    public ScreenShotSteps() throws IOException {
    }
    @Given("User launches the URL {string}")
    public void user_launches_the_url(String string) throws IOException {
        CommonMethods.GetURL(string);
    }

    @Then("User clicks on Exercises button")
    public void user_clicks_on_exercises_button() {
        screen.ClickExercises();
    }

    @Then("User takes a ScreenShot of the page")
    public void user_takes_a_screen_shot_of_the_page() throws IOException {
        screen.ActionsScreenShot();
    }



}
