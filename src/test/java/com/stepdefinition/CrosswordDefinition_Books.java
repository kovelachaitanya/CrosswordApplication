package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CrosswordBooks_page;
import com.seleniumutility.Seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordDefinition_Books extends Library {
	CrosswordBooks_page crossword_books;
	Seleniumutility screenshot;
	final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Books.class.getName());
	
	
	@Given("^The crosword page is launched and opened$")
	//To launch the crossword webpage
	public void the_crosword_page_is_launched_and_opened()throws IOException {
		launchApp();
		LOG.info("Browser launched");
		
	}
	
	@Then("^Books option is selected$")
	//To click on Books icon 
	public void books_option_is_selected() {
		crossword_books = new CrosswordBooks_page(driver);
		crossword_books.Books_section();
		LOG.info("clicked on Books icon");
	}
	
	@Then("^Desired Book is selected and detail is given$")
	//To select the book and check availability
	public void desired_Book_is_selected_and_detail_is_given() {
		crossword_books.Book_selection();
		crossword_books.Check_Availability();
		crossword_books.Enter_zipcode();
		crossword_books.Submit();
		LOG.info("desired book is selected and clicked on show full details");
		
		
	}
	
	@Then("^Browser is quit$")
	//To take screenshot and close the browser
	public void browser_is_quit() {
		screenshot = new Seleniumutility (driver);
		screenshot.takeSnapShot("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Screenshots\\Books.png");
		LOG.info("Screenshot taken sucessfully");
		driver.quit();
		LOG.info("Browser quit sucessfully");
	}



}
