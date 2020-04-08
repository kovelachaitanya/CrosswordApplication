package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordBooks_page {
	

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"nav-menu-915599\"]/ul/li[2]/a")
	WebElement books;

	@FindBy(linkText = "Urban Naxals")
	WebElement urbannaxals;

	@FindBy (xpath = "//*[@id=\"search-result-items\"]/li/div/div[2]/a")
	WebElement quickview;

	@FindBy(xpath = "//*[@id=\"variant_link\"]/a")
	WebElement fulldetails;

	@FindBy(name = "zipcode")
	WebElement pincode;

	@FindBy(name = "commit")
	WebElement submit;
	
	public CrosswordBooks_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	//To click on books section in webpage
	public void Books_section() {
		books.click();
		
	}
	//To select the require book and check the details
	public void Book_selection() {
		Actions action =new Actions(driver);
		action.moveToElement(urbannaxals).perform();
		Actions s=action.moveToElement(quickview).click();
		s.build().perform();
	}
	//To check the availability of the selected book
	public void Check_Availability() {
		fulldetails.click();
	}
	//To enter the pincode to see for delivery
	public void Enter_zipcode() {
		pincode.sendKeys("500020");
	}
	//To click on submit
	public void Submit() {
		submit.click();
	}

}
