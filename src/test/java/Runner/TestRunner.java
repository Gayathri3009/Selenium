package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import  org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//java//Features",
        glue = {"stepDefinitions", "Hooks"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //tags=  "@CheckBox or @AlertBox or @RadioButton",
        tags="  @AmazonOrder",
        dryRun = false,
        monochrome = true



)

public class TestRunner {

}
