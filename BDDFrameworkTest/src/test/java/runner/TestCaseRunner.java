package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/ccum", "json:target/json/cucumber.json"},
features={"src//test//resources//features"},tags={"@HomePageTest"},glue={"testCaseses"},monochrome=true)
public class TestCaseRunner {

}


