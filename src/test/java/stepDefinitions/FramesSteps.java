package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.Frames;
import org.junit.Assert;

import java.io.IOException;

public class FramesSteps {
    Frames frame=new Frames();
    @Given("User launches the URL for frames {string}")
    public void user_launches_the_url_for_frames(String string) throws IOException {
        CommonMethods.GetURL(string);
    }
    @Then("User sends data inside the frames")
    public void user_sends_data_inside_the_frames() {
        Assert.assertTrue(frame.ActionsFrame());
    }
}
