package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.MouseHover;

import java.io.IOException;

public class MouseHoverSteps {
    MouseHover hover =new MouseHover();
    @Given("User launches the URL for mousehover {string}")
    public void user_launches_the_url_for_mousehover(String string) throws IOException {
        CommonMethods.GetURL(string) ;
    }
    @Then("User can directly hover over the mouse")
    public void user_can_directly_hover_over_the_mouse() {
        hover. ActionsMouseHover();

    }
}
