package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordElectronics_page {
	WebDriver driver;
	
	@FindBy(linkText = "Categories")
	WebElement categories;
	
	@FindBy(xpath = "//*[@id=\"nav-menu-915599\"]/ul/li[1]/ul/li[3]/a")
	WebElement Electronics;
	
	@FindBy(xpath = "//*[@id=\"nav-menu-915599\"]/ul/li[1]/ul/li[3]/ul/li/div/div[1]/div[1]/h4/a")
	WebElement musicplayer;

	public CrosswordElectronics_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//To select categories in webpage using mous over actions
	public void Categories() {
		Actions action = new Actions(driver);
		action.moveToElement(categories).perform();
		Actions action1 = action.moveToElement(Electronics);
		action1.build().perform();
				
	}
	//To select the desired item in that categories
	public void MusicPlayer() {
		musicplayer.click();
	}

}
