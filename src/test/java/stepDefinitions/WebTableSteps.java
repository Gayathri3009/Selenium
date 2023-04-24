package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.WebTable;

import java.io.IOException;

public class WebTableSteps {
    WebTable table=new WebTable();
    @Given("User launches the URL for table {string}")
    public void user_launches_the_url_for_table(String string) throws IOException {
        CommonMethods.GetURL(string);
    }
    @Then("User directly automates the table in the website")
    public void user_directly_automates_the_table_in_the_website() throws InterruptedException {
       table.ActionsWebTable();
    }


}
