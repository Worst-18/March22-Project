package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_page {
	
public WebDriver driver;
	
	@FindBy(xpath="(//a[@title=\"T-shirts\"])[2]")
	
	private WebElement tshirt ;

	public Account_page(WebDriver driver2) {
	
		this.driver = driver2; 
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return tshirt;
	}
	
	


}
