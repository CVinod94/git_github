package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	public  WebDriver driver;

	@FindBy(id="radiobutton_0")
	private WebElement clickradiobtn;
	@FindBy(id="continue")
	private WebElement clickctnbtn;
	public ConfirmationPage(WebDriver driver4) {
		this.driver=driver4;
PageFactory.initElements(driver, this);
	}
	public WebElement getClickradiobtn() {
		return clickradiobtn;
	}
	public WebElement getClickctnbtn() {
		return clickctnbtn;
	}
}
