package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordMyaccount_page {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[4]")
	WebElement myacct;

	@FindBy(id = "customer_user_attributes_name")
	WebElement name;

	@FindBy(id = "customer_user_attributes_email")
	WebElement emailid;

	@FindBy(id = "customer_user_attributes_password")
	WebElement password;

	@FindBy(id = "customer_user_attributes_password_confirmation")
	WebElement confirm;

	@FindBy(id = "customer_user_attributes_additional_detail_dob")
	WebElement dob;

	@FindBy(id = "customer_gender_male")
	WebElement gender;

	@FindBy (id = "customer_submit")
	WebElement submit;
	
	public CrosswordMyaccount_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//To click on Myaccount option in crossword webpage
	public void crossword_Myaccount() {
		myacct.click();
	}
	//To Enter users name 
	public void user_name(String uname) {
		name.sendKeys(uname);
	}
	//To give users emailid
	public void user_email(String uemail) {
		emailid.sendKeys(uemail);

	}
	//To give user password
	public void user_password(String upassword) {
		password.sendKeys(upassword);

	}
	//To give user passowrd for confirmation
	public void confirm_password(String uconfirm) {
		confirm.sendKeys(uconfirm);

	}
	//To give users date of birth
	public void user_DOB(String birthday) {
		dob.sendKeys(birthday);

	}
	//To select user gender
	public void user_gender() {
		gender.click();

	}
	//To click on submit
	public void submit_button() {
		submit.click();

	}

}
