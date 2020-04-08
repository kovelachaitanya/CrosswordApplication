package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CrosswordElectronics_page;
import com.seleniumutility.Seleniumutility;

import cucumber.api.java.en.And;


public class CrosswordDefinition_Electronics extends Library{
	CrosswordElectronics_page Crossword_Electronics;
	Seleniumutility screenshot;
	
	final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Electronics.class.getName());

    @Given("^The crossword website is launched and opened$")
    //To launch the crossword website
    public void the_crossword_website_is_launched_and_opened()throws IOException {
    	launchApp();
    	LOG.info("crossword website launched");
    }
    @Then("^item is searched and selected$")
    //To select the desired item
    public void item_is_searched_and_selected() {
    	Crossword_Electronics = new CrosswordElectronics_page(driver);
    	Crossword_Electronics.Categories();
    	Crossword_Electronics.MusicPlayer();
    	LOG.info("Directed to prescribed location for selecting an item");
    	
    }
    //To take screenshot and close the browser
    @And("^close the browser$")
    public void close_the_browser() {
    	screenshot = new Seleniumutility(driver);
    	screenshot.takeSnapShot("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Screenshots\\Electronics.png");
    	LOG.info("Screenshot taken sucessfully");
    	driver.quit();
    	LOG.info("Browser quit sucessfully");
    	
    }

}