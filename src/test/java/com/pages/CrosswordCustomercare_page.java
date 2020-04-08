package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordCustomercare_page {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[8]")
	WebElement care;

	@FindBy(xpath = "//*[@id=\"orderRelatedQueryLink\"]/span")
	WebElement proceed;

	@FindBy(id = "order_id")
	WebElement orderid;

	@FindBy(id = "email_id")
	WebElement emailid;

	@FindBy(id = "phone_number")
	WebElement phone;

	@FindBy(id = "query")
	WebElement query;

	@FindBy(id = "order-query-next")
	WebElement next;
	
	public CrosswordCustomercare_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//To click on customercare icon
	public void customer_care() {
		care.click();

	}
	//To click on proceed icon
	public void click_proceed() {
		proceed.click();

	}
	//To enter orderid
	public void Enter_orderid() {
		orderid.sendKeys("123654789");

	}
	//To enter emailid
	public void Enter_emialid() {
		emailid.sendKeys("kovelachaitanya@gmail.com");

	}
	//To enter phonenumber
	public void Enter_phonenumber() {
		phone.sendKeys("123456789");

	}
	//To enter query
	public void Enter_Query() {
		query.sendKeys("order not yet delivered yet");

	}
	//To click on next button
	public void Click_Next() {
		next.click();

	}

}
