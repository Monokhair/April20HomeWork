package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\source\\features", 
		glue = "steps", 
		tags = "@AddNewAccountFeature", 
		monochrome = true, 
		strict = true,
		dryRun = false,
		plugin = { "pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber,json",
				 }

)

public class Runner {

}
