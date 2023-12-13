package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",
glue= {"stepDefinitions"},
plugin = {"pretty","html:target/cucumber-html-reports"},
monochrome =true,
dryRun=false,
tags="@HomePage"
		)

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
