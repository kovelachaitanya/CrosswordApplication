package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CrosswordCustomercare_page;
import com.seleniumutility.Seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordDefinition_customercare extends Library {
	CrosswordCustomercare_page customercare;
	Seleniumutility screenshot;
	
	final static Logger LOG = LogManager.getLogger(CrosswordDefinition_customercare.class.getName());

	@Given("^The crossword webpage is opened$")
	//To launch the crossword webpage
	public void the_crossword_webpage_is_opened() throws IOException {
		launchApp();
		LOG.info("Browser launched sucessfully");
		
	}
	
	@Then("^Customercare icon is  and opened$")
	//To click on customer care icon
	public void customercare_icon_is_and_opened() {
		customercare = new CrosswordCustomercare_page(driver);
		customercare.customer_care();
		customercare.click_proceed();
		LOG.info("Customer icon is clicked and selected proceed");
		
	}
	
	@Then("^customer query details are given$")
	//To give details and query in the required field
	public void customer_query_details_are_given() {
		customercare.Enter_orderid();
		customercare.Enter_emialid();
		customercare.Enter_phonenumber();
		customercare.Enter_Query();
		customercare.Click_Next();
		LOG.info("query details are given");
		
	}
	
	@Then("^browser is closed and quit$")
	//To take screenshot and close the browser
	public void browser_is_closed_and_quit() {
		screenshot = new Seleniumutility(driver);
		screenshot.takeSnapShot("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Screenshots\\customercare.png");
		LOG.info("screenshot taken sucessfully");
		driver.quit();
		LOG.info("browser quit sucessfully");
		
	}


}
