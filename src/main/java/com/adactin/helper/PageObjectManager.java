package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.ConfirmationPage;
import com.adactin.pom.Homepage;
import com.adactin.pom.Logout;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SreachHotels;

public class PageObjectManager {
	private WebDriver driver;
	private Homepage login;
	private SreachHotels sreach;
	private PaymentPage payment;
	private ConfirmationPage confirmation;
	private Logout logout;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public Homepage getLoginPage() {

		login = new Homepage(driver);
		return login;
	}

	public SreachHotels getSreachHotels() {
		sreach = new SreachHotels(driver);
		return sreach;

	}

	public ConfirmationPage getConfirmation() {
		confirmation = new ConfirmationPage(driver);
		return confirmation;
	}

	public PaymentPage getPayment() {
		payment = new PaymentPage(driver);
		return payment;
	}

	public Logout getLogout() {
		logout = new Logout(driver);
		return logout;
	}
}
