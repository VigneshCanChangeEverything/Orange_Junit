package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/LoginFeatures",glue = {"stepDef"}, monochrome = true,
plugin = {"pretty","json:target/Reports/Rep.json"} , tags ="@S1"

		)


public class TestRun {

}


/* @RunWith(Cucumber.class) >>> RunWith Annotation invoke the Junit to run the Cucumber Tests 

@CucumberOptions(features ="src/test/resources/LoginFeatures",glue = {"stepDef"}, monochrome = true) 
>>> Cucumber options Configures the Features, Stepdef and Report paths 
*/