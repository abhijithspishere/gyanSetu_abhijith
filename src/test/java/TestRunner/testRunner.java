package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features", // Path to feature files
        glue = {"StepDefinition", "Hooks"}, // Package names of Step Definitions and Utilities
        plugin = {
                "pretty",
                "html:target/cucumber-html-report", // HTML report location
                "json:target/json-cucumber.json"   // JSON report location
        }
)
public class testRunner {
}
