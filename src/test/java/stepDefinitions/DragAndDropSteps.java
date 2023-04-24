package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CommonMethods;
import org.example.DragAndDrop;

import java.io.IOException;

public class DragAndDropSteps {
   DragAndDrop drag=new DragAndDrop();
    public DragAndDropSteps() throws IOException{

    }
    @Given("User goes to the DragAndDrop url {string}")
    public void user_goes_to_the_drag_and_drop_url(String string) throws IOException {
        CommonMethods.GetURL(string);
    }


    @Then("User clicks on Drag Me box")
    public void userclicksondragmebox() throws InterruptedException{


    }
    @Then("User drops it in Drop here box")
    public void userdropsitindropherebox() throws InterruptedException {
        drag.DragAndDrop();

    }



    }

