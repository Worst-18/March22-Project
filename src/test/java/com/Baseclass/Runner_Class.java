package com.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.March22_Project.Base_Class;

public class Runner_Class extends Base_Class {
public static void main(String[] args, Object dorathibanisha18) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\SELENIUM");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   getUrl("http://automationpractice.com//");
		
		WebElement Signin_Btn= driver.findElement(By.xpath("//a[@class='login']"));
        clickOnElement(Signin_Btn);

		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		InputValueElement(email, "dorathibanisha18@gmail.com");
	
	    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	    InputValueElement(password, "1234Music");
	    
	    WebElement Signin= driver.findElement(By.xpath("//a[@button='submit login']"));
		clickOnElement(Signin);
		
		close();
	
	}
}
	

