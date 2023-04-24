package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.AmazonSite;
import org.example.CommonMethods;

import java.io.IOException;

public class AmazonSiteSteps {
    AmazonSite amazon=new AmazonSite();
    @Given("User lauches the amazon website {string}")
    public void user_lauches_the_amazon_website(String string) throws IOException {
        CommonMethods.GetURL(string);

    }

    @Then("User searches for the {string}")
    public void userSearchesForThe(String laptop) {
        amazon.Search(laptop);
    }


    @Then("User gets the list of products in ascending order according to their price and chooses the high priced one")
    public void userGetsTheListOfProductsInAscendingOrderAccordingToTheirPriceAndChoosesTheHighPricedOne() {
        amazon.OrderBy();
    }
}
