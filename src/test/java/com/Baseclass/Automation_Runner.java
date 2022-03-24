package com.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Runner {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\SELENIUM");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		
		WebElement Signin_Btn= driver.findElement(By.xpath("//a[@class='login']"));
		Signin_Btn.click();
		
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("dorathibanisha18@gmail.com");
	
	    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys("1234Music");
	    
	    WebElement Signin= driver.findElement(By.xpath("//a[@button='submit login']"));
		Signin.click();
		
	}


	}

	