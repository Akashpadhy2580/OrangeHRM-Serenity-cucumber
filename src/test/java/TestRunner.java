import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                glue = "stepdefinitions",
                plugin = {"pretty","html:target/Reports/Cucumber-Report.html"},
                tags = "@orangehrm")
public class TestRunner {
}
