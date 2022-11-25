
package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json"},
features="C:\\Users\\edara\\eclipse-workspace\\CucumberSalesforce\\resources\\Salesforce.feature",
glue= {"com.training.steps"})


public class Runner {

}
