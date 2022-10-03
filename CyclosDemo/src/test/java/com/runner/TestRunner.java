package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepDefinition",
		plugin={"html:Reports/HTMLReports","json:Reports\\JsonReports\\cucumber.json",
				"junit:Reports\\JUnitReports\\cucumber.xml"},
		monochrome=true,
		dryRun=false
		)

public class TestRunner {

}
