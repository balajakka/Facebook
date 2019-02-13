package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by balajakka on 27/01/2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\srini\\CloneProjects\\Facebook\\src\\test\\Features",
        glue={"stepDefinitions"},
        format = {"pretty", "html:target/destination" +
                ""}
)
public class TestRunner {
}
