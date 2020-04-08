package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.Excelutility;
import com.pages.CrosswordMyaccount_page;
import com.seleniumutility.Seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordDefinition_Myaccount extends Library {
	CrosswordMyaccount_page crossword_myaccount;
	Seleniumutility screenshot;
	Excelutility excel_file;
	
	final static Logger logger = LogManager.getLogger(CrosswordDefinition_Myaccount.class.getName());

	@Given("^The crosswrd page is launched$")
	//To launch the crossword webpage
	public void the_crosswrd_page_is_launched() throws IOException {
		launchApp();
		logger.info("Browser launched sucessfully");
	}
	
	@Then("^Clicked on Myaccount$")
	//To click on myaccount icon
	public void clicked_on_Myaccount() throws Throwable{
		crossword_myaccount = new CrosswordMyaccount_page(driver);
		crossword_myaccount.crossword_Myaccount();
		logger.info("Myaccount icon is selected");
	}
	
	@Then("^Given the required details$")
	//To give the required details for account creation
	public void given_the_required_details()throws Throwable {
		
		excel_file = new Excelutility();
		crossword_myaccount.user_name(excel_file.user_Name(1));
		crossword_myaccount.user_email(excel_file.user_Emailid(1));
		crossword_myaccount.user_password(excel_file.user_Password(1));
		crossword_myaccount.confirm_password(excel_file.user_Confirmpassword(1));
		crossword_myaccount.user_DOB(excel_file.user_Birthdetails(1));

crossword_myaccount = new CrosswordMyaccount_page(driver);		

		crossword_myaccount.user_gender();
		crossword_myaccount.submit_button();

logger.info("Details for account creation are given");

		
	}
	
	@Then("^Browser is closed$")
	//To take the screenshot and close the browser
	public void browser_is_closed() {
		screenshot = new Seleniumutility (driver);
		screenshot.takeSnapShot("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Screenshots\\myaccount.png");
		logger.info("Screenshot took sucessfully");
		driver.quit();
		logger.info("Browser quit sucessfully");
		
	}


}
