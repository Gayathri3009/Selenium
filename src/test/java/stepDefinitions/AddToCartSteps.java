package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.AddToCart;
import org.example.CommonMethods;
import org.junit.Assert;

import java.io.IOException;

public class AddToCartSteps {
    AddToCart add = new AddToCart();

    @Given("User launches the URL of amazon {string}")
    public void user_launches_the_url_of_amazon(String string) throws IOException {
        CommonMethods.GetURL(string);

    }

    @Then("User searches the desired product")
    public void user_searches_the_desired_product() {
        Assert.assertTrue(add.ActionsSend());

    }

    @Then("User clicks on the product from menu")
    public void user_clicks_on_the_product_from_menu() {
        Assert.assertTrue(add.ActionsClick());

    }

    @Then("User is navigated to the desired product")
    public void user_is_navigated_to_the_desired_product() {
        Assert.assertTrue(add.ActionsNavigate());

    }


    @Then("User adds the product to the cart")
    public void user_adds_the_product_to_the_cart() {
       Assert.assertTrue(add.ActionsAdd());
    }

    }


