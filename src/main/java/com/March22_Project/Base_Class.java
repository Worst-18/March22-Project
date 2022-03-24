package com.March22_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class{
	
	public static  WebDriver driver ;
	

	public static  WebDriver browser_configuration(String type) {
		if(type. equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\March22_Project\\Driver\\chromedriver.exe");
		  driver= new ChromeDriver();
		}
//		else if (type. equalsIgnoreCase("firefox")) {
//			System.setProperty("Webdriver.gecko.driver",
//					System.getProperty("user.dir")+ "\\Driver\\msedgdriver.exe");
//		}
		driver.manage().window().maximize();

		return driver; 
	
	}
	
	public static void clickOnElement(WebElement elements) {
		      elements.click();
	}
	
              public static void InputValueElement(WebElement elements, String data) {
	          elements.sendKeys(data);

 }
              public static void getUrl(String Url) {		
            	  driver.get(Url);
   }        
              
              public static  void implicitwait(int time, TimeUnit format) {
            	  
            	  driver.manage().timeouts().implicitlyWait(time, format);
            	  
			}
              
              public static void close() {
	          driver.close();
	
 }}
		

 
