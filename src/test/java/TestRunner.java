import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/featureFiles",
                glue = "stepdefinitions",
                plugin = {"pretty","html:target/Reports/Cucumber-Report.html"},
                tags = "@login")

public class TestRunner {
}
