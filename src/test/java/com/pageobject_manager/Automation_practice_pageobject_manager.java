package com.pageobject_manager;

import org.openqa.selenium.WebDriver;

import com.POM.Account_page;
import com.POM.Add_to_cart;
import com.POM.Home_Page;
import com.POM.Login_Page;
import com.POM.Proceed_to_checkout;
import com.POM.Signout;
import com.POM.Tshirt;

public class Automation_practice_pageobject_manager {

	public WebDriver driver;

	private Home_Page hp;
	private Login_Page login;
	private Account_page tshirt;
	private Tshirt model;
	private Add_to_cart cart;
	private Proceed_to_checkout proceed;
	private Signout signout;

	public Automation_practice_pageobject_manager(WebDriver driver2) {

		this.driver = driver2;
	}

	public Home_Page get_Instance_Hp() {

		if (hp == null) {

			hp = new Home_Page(driver);
		}

		return hp;

	}

	public Login_Page get_Instance_Login() {

		if (login == null) {

			login = new Login_Page(driver);

		}

		return login;
	}

	public Account_page get_Instance_Tshirt() {

		if (tshirt == null) {

			tshirt = new Account_page(driver);

		}

		return tshirt;
	}

	public Tshirt get_Instance_model() {

		if (model == null) {

			model = new Tshirt(driver);

		}

		return model;
	}

	public Add_to_cart get_Instance_Cart() {

		if (cart == null) {

			cart = new Add_to_cart(driver);

		}

		return cart;
	}

	public Proceed_to_checkout get_Instance_proceed() {

		if (proceed == null) {

			proceed = new Proceed_to_checkout(driver);

		}

		return proceed;
	}

	public Signout get_Instance_signout() {

		if (signout == null) {

			signout = new Signout(driver);

		}

		return signout;
	}

}
