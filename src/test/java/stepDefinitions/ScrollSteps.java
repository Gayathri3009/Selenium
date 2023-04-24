package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.Scroll;

import java.io.IOException;

public class ScrollSteps {
    Scroll scrol=new Scroll();
    @Given("User launches the URL of flags {string}")
    public void user_launches_the_url_of_flags(String string) throws IOException {
        CommonMethods.GetURL(string);

    }
    @Then("User directly scrolls on the website")
    public void user_directly_scrolls_on_the_website() throws InterruptedException {
        scrol.ActionsScroll();

    }
}
