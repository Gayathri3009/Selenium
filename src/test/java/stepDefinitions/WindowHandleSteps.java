package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.WindowHandle;

import java.io.IOException;

public class WindowHandleSteps {
    WindowHandle window=new WindowHandle();


    public WindowHandleSteps() throws IOException {
    }

    @Given("User launches the browser for windowhandles {string}")
    public void user_launches_the_browser_for_windowhandles(String string) throws IOException {
        CommonMethods.GetURL(string);

    }

    @Then("User clicks on the button and sees a new window")
    public void user_clicks_on_the_button_and_sees_a_new_window() throws InterruptedException {
        window.ActionsWindowHandle();


    }

}
