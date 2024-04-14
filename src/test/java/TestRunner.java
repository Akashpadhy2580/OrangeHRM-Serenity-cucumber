import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                glue = "src/test/java/stepdefinitions",
                plugin = "pretty,html:taget/Reports",
                tags = "@orangehrm")
public class TestRunner {
}
