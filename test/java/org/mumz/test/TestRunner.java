package org.mumz.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Mumz.feature",glue="src\\test\\java",dryRun=true,monochrome=true,plugin= {"pretty","html:target/cucumber-reports"})

public class TestRunner {

	
}
