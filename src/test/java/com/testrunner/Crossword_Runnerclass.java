package com.testrunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature",
		plugin = {"pretty", "html:target\\cucumber-html-report",
				"json:target\\cucumber-json-report",
				"junit:target\\cucumber-junit-report",
				"com.cucumber.listener.ExtentCucumberFormatter:target\\cucmber-extent-report\\Extentreport.html"},
		tags = {"@tc_01_Login,@tc_02_customercare,@tc_03_Register,"
				+ "@tc_04_Books,@tc_05_Selecting_an_item"},
		glue = {"com.stepdefinition"},
		monochrome = true
		)
public class Crossword_Runnerclass {
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent-config.xml");
	    Reporter.setSystemInfo("user", System.getProperty("user.name"));
	    Reporter.setSystemInfo("os", "Windows");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
