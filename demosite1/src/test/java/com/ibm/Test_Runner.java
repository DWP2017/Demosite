package com.ibm;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources"},
		tags = {"@successful"},
		snippets = SnippetType.CAMELCASE,
		plugin = {"com.ibm.ExtentFormatter:output/extent-report/index.html", "pretty:target/Cucumber-pretty.txt","html:output/html-report"}
)
public class Test_Runner {
	 @AfterClass
	    public static void setup() {
	       ExtentReporter.setConfig("src/test/resources/config.xml");
	       ExtentReporter.setSystemInfo("Browser", "Firefox");
	       ExtentReporter.setSystemInfo("Selenium", "v3.7.1");
	    }
}