package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.Upload;

import java.io.IOException;

public class UploadSteps {
    Upload up=new Upload();
    @Given("User launches the browser for upload {string}")
    public void user_launches_the_browser_for_upload(String string) throws IOException {
        CommonMethods.GetURL(string);

    }
    @Then("User uploads the file in desired location")
    public void user_uploads_the_file_in_desired_location() throws InterruptedException {
     up.ActionsUpload();
    }

}
