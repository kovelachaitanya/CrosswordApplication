package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.stepdefinition.CrosswordDefinition_Books;

public class Library {
 protected WebDriver driver;
 Properties prop;
 FileInputStream fis;

 final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Books.class.getName());

 
  public void launchApp() throws IOException {
	  //The path of config.property
	    fis = new FileInputStream("F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\configurationproperty\\config.property");
	    
	    prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
 LOG.info("Path copied from configuration property file");
  try {
  //For launching firefox browser
  if(browser.equalsIgnoreCase("firefox")) {
  driver = new FirefoxDriver();
  LOG.info("to launch firefox driver");

  }
  else if (browser.equalsIgnoreCase("chrome")) {
  //For launching chrome browser
  System.setProperty("webdriver.chrome.driver", "F:\\krishna chaitanya\\CrosswordApplication\\src\\test\\resources\\Driver\\chromedriver.exe");
  driver = new ChromeDriver();
  LOG.info("to launch chrome driver");

  }
  
 // To window to get maximize
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(prop.getProperty("url"));
  LOG.info("to maximize the window");

 
 
  }catch(WebDriverException e) {
  System.out.println("browser couldnot be launched");
  }
}
 // To quit the browser 
  public void quit() {
  driver.quit();
  LOG.info("To quit the browser");

  }
}