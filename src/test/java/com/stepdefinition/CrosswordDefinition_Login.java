package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CrosswordLogin_page;
import com.seleniumutility.Seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordDefinition_Login extends Library {
	CrosswordLogin_page crossword_login;
	Seleniumutility screenshot;
	
final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Login.class.getName());

	@Given("^The Crossword page is opened$")
	//To launch crossword webpage
	public void the_Crossword_page_is_opened() throws IOException{
		launchApp();
		LOG.info("browser launched sucessfully");
		
	}

	@Then("^Login page is opened$")
	//To click on Login option
	public void login_page_is_opened() {
		crossword_login = new CrosswordLogin_page(driver);
		crossword_login.To_Login();
		LOG.info("Clicked on login icon");
		
	}

	@Then("^The \"([^\"]*)\" and \"([^\"]*)\"  details are given$")
	//To give the required details for login
	public void the_and_details_are_given(String username , String userpassword) {
		crossword_login.username(username);
		crossword_login.password(userpassword);
		crossword_login.Submit_button();
		LOG.info("Details are given and cliked login");
	}



	@Then("^Close browser and quit$")
	//To take screenshot and close the browser
	public void close_browser_and_quit() {
		screenshot = new Seleniumutility(driver);
		screenshot.takeSnapShot("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Screenshots\\login.png");
		LOG.info("Screenshot taken sucessfully");
		driver.quit();
		LOG.info("Driver quit sucessfully");
		
	}


}
