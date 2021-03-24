package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/Gmail_login.feature",glue= {"StepDefinitions"}
,monochrome = true
,plugin = {"json:target/cucumber.json"})




public class TestRunner {

}



/* ={"pretty","html:target/HtmlReports"} */

/*
 * 
 * ,monochrome = true 
 * plug in={"pretty","junit:target/JUnitReports/report.xml",
 * "json:target/JSONReports/report.json", "html:target/HtmlReports"}
 */