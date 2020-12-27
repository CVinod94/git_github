package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SreachHotels {
	public  WebDriver driver;

	@FindBy(id = "location")
	private WebElement getlocation;
	@FindBy(id= "hotels")
	private WebElement gethotels;
	@FindBy(id="room_type")
	private WebElement getroomtype;
	@FindBy(id="room_nos")
	private WebElement getroom_nos;
	@FindBy(id="datepick_in")
	private WebElement getcheckin;
	@FindBy(id="datepick_out")
	private WebElement getcheckout;
	@FindBy(id="adult_room")
	private WebElement getadults_nos;
	@FindBy(id="child_room")
	private WebElement getchilds_nos;
	@FindBy(id="Submit")
	private WebElement sreach;

	public SreachHotels(WebDriver driver3) {
		this.driver=driver3;
    PageFactory.initElements(driver, this);
	}
	public WebElement getGetlocation() {
		
		return getlocation;
	}
	public WebElement getGethotels() {
		return gethotels;
	}
	public WebElement getGetroomtype() {
		return getroomtype;
	}
	public WebElement getGetroom_nos() {
		return getroom_nos;
	}
	public WebElement getGetcheckin() {
		return getcheckin;
	}
	public WebElement getGetcheckout() {
		return getcheckout;
	}
	public WebElement getGetadults_nos() {
		return getadults_nos;
	}
	public WebElement getGetchilds_nos() {
		return getchilds_nos;
	}
	public WebElement getSreach() {
		return sreach;
	}
}
