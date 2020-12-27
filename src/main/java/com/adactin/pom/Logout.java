package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;

	public Logout(WebDriver driver6) {
		this.driver= driver6;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		
		return logout;
	}

}
