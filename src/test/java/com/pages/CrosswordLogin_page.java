package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordLogin_page {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")
	WebElement login;
	
	
	@FindBy(xpath = "//*[@id=\"user_session_email\"]")
	WebElement uemail  ;

	
	@FindBy(xpath = "//*[@id=\"user_session_password\"]")
	WebElement userpassword;
	

	@FindBy(xpath = "//*[@id=\"user_session_submit\"]")
	WebElement submit;
	
	public CrosswordLogin_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//To click on login option
	public void To_Login() {
		login.click();	
	}
	//To enter email
	public void username(String email) {
		uemail.sendKeys(email);
		
	}
	//To enter password
	public void password(String password) {
		userpassword.sendKeys(password);
		
	}
	//To click on login button to submit
	public void Submit_button() {
		submit.click();
		

	}

}
