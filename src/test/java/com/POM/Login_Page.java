package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(xpath = "(//button[@type=\"submit\"])[3]")
	private WebElement submitlogin;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitlogin() {
		return submitlogin;
	}

	public Login_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
