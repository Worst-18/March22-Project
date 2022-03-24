package com.pageobject_manager;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import com.March22_Project.Base_Class;

public class Runner_POManager extends Base_Class  {

	public static WebDriver driver = browser_configuration("chrome");

	public static Automation_practice_pageobject_manager pom = new Automation_practice_pageobject_manager(driver);
	
	public static Logger log = Logger.getLogger("Runner_POManager");
 
	public static void main(String[] args) throws Throwable{
		
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com//");
		
		implicitwait(10, TimeUnit.SECONDS);
		
		log.info("before Url launch");

		clickOnElement(pom.get_Instance_Hp().getSignin_Btn());
		
		InputValueElement(pom.get_Instance_Login().getEmail(), "dorathibanisha18@gmail.com");

		InputValueElement(pom.get_Instance_Login().getPassword(), "NightDreamer2345");

		clickOnElement(pom.get_Instance_Login().getSubmitlogin());
		
		log.info("after Url launch");
 

		close();

	}
}
