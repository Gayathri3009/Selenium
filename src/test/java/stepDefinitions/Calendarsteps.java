package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Calendar;
import org.example.CommonMethods;

import java.io.IOException;

public class Calendarsteps {
    Calendar cal=new Calendar();
    @Given("User launches the URL for calendar {string}")
    public void user_launches_the_url_for_calendar(String string) throws IOException {
        CommonMethods.GetURL(string);

    }

    @Then("User can select the appropriate date")
    public void user_can_select_the_appropriate_date() throws InterruptedException {
        cal.ActionsCalendar();

    }

}
