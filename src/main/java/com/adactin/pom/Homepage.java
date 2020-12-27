package com.adactin.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

@FindBy(id="username")
private WebElement getmail;
@FindBy(id="password")
private WebElement getpass;
@FindBy(id="login")
private WebElement sub;
public Homepage(WebDriver driver2) {
	this.driver= driver2;
PageFactory.initElements(driver, this);
}
public WebElement getGetmail() {
	return getmail;
}
public WebElement getGetpass() {
	return getpass;
}
public WebElement getSub() {
	return sub;
}

}

	

