package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CommonMethods;
import org.example.EndToEnd;
import org.testng.Assert;

import java.io.IOException;

public class EndToEndSteps {
    EndToEnd end=new EndToEnd();
    @Given("User launches the URL of tutorialspoint {string}")
    public void user_launches_the_url_of_tutorialspoint(String string) throws IOException {
        CommonMethods.GetURL(string);

    }
    @When("User gives consent for login")
    public void userGivesConsentForLogin() {
        Assert.assertTrue(end.clickConsent());
    }
    @Then("User clicks on first name and writes their name")
    public void user_clicks_on_first_name_and_writes_their_name() {
       Assert.assertTrue(end.FirstName());


    }
    @Then("User clicks on last name and writes their name")
    public void user_clicks_on_last_name_and_writes_their_name() {
      Assert.assertTrue (end.LastName());

    }
    @Then("User picks up the gender")
    public void user_picks_up_the_gender() {
        Assert.assertTrue(end.Gender());

    }
    @Then("User picks up their years of experience")
    public void user_picks_up_their_years_of_experience() {
        Assert.assertTrue(end.Experience());

    }
    @Then("User mentions the correct date")
    public void user_mentions_the_correct_date() {

       Assert.assertTrue (end.Date());
    }
    @Then("user selects their profession")
    public void user_selects_their_profession() {

       Assert.assertTrue (end.Profession());

    }
    @Then("User uploads a copy of their profile picture")
    public void user_uploads_a_copy_of_their_profile_picture() throws InterruptedException {
       Assert.assertTrue (end.Profile());

    }
    @Then("user picks up their choice in selenium")
    public void user_picks_up_their_choice_in_selenium() {
        Assert.assertTrue( end.Flavours());

    }
    @Then("user correctly selects the continent from the drop down")
    public void user_correctly_selects_the_continent_from_the_drop_down() throws InterruptedException {
        Assert.assertTrue(end.Continents());

    }
    @Then("User takes up the selenium commands from the dropdown")
    public void user_takes_up_the_selenium_commands_from_the_dropdown() throws InterruptedException {
        Assert.assertTrue(end.SeleniumCommands());
    }
    @Then("User clicks on the submit button")
    public void user_clicks_on_the_submit_button() throws InterruptedException {
       end.Button();

    }



}
