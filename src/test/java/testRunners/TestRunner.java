package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "features" },
        glue = { "testSteps" },
        plugin = { "pretty", "html:report" }
)

public class TestRunner {
}
