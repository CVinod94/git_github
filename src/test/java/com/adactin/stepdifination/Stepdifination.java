package com.adactin.stepdifination;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Baseclass;
import com.adactin.pom.ConfirmationPage;
import com.adactin.pom.Homepage;
import com.adactin.pom.Logout;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SreachHotels;
import com.adactin.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Stepdifination extends Baseclass {

	public static WebDriver driver = Runner.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);
//	Homepage hp = new Homepage(driver);
//	SreachHotels sh = new SreachHotels(driver);
//	ConfirmationPage cp = new ConfirmationPage(driver);
//	PaymentPage pp = new PaymentPage(driver);
//	Logout lo = new Logout(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("scenarioName: " + name);
	}

	@After
	public void afterHook(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("     scenarioStatus:   " + status);
		if (scenario.isFailed()) {
			TakesScreenShot(scenario.getName());
		}

	}

	@Given("^User launchs the web borswer$")
	public void user_launchs_the_web_borswer() throws Throwable {
		getUrl("http://adactinhotelapp.com/");
		// String url = FileReaderManager.getInstance().getInstanceReader().getURL();
		// getUrl(url);
	}

	@When("^User enters the user name in user field$")
	public void user_enters_the_user_name_in_user_field() throws Throwable {
		// inputvaluetoElement(hp.getGetmail(), "vinod094");
		// String username =
		// FileReaderManager.getInstance().getInstanceReader().getUser_Name();
		// inputvaluetoElement(pom.getLoginPage().getGetmail(), username);
		inputvaluetoElement(pom.getLoginPage().getGetmail(), "vinod094");
	}

	@When("^User enters the password in passwrod field$")
	public void user_enters_the_password_in_passwrod_field() throws Throwable {
		// inputvaluetoElement(hp.getGetpass(), "Vike@094");
		// String password =
		// FileReaderManager.getInstance().getInstanceReader().getPassword();
		// inputvaluetoElement(pom.getLoginPage().getGetpass(), password);
		inputvaluetoElement(pom.getLoginPage().getGetpass(), "Vike@094");
	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		// click(hp.getSub());
		click(pom.getLoginPage().getSub());

	}

	@When("^User selects location from location field$")
	public void user_selects_location_from_location_field() throws Throwable {
		// selectDropDown(sh.getGetlocation(), "8", "index");
		selectDropDown(pom.getSreachHotels().getGetlocation(), "8", "index");
	}

	@When("^User selects hotels from hostels filed$")
	public void user_selects_hotels_from_hostels_filed() throws Throwable {
		// selectDropDown(sh.getGethotels(), "2", "index");
		selectDropDown(pom.getSreachHotels().getGethotels(), "2", "index");
	}

	@When("^User selects room type from room type field$")
	public void user_selects_room_type_from_room_type_field() throws Throwable {
		// selectDropDown(sh.getGetroomtype(), "4", "index");
		selectDropDown(pom.getSreachHotels().getGetroomtype(), "4", "index");
	}

	@When("^User selects no\\.of rooms from rooms filed$")
	public void user_selects_no_of_rooms_from_rooms_filed() throws Throwable {
		// selectDropDown(sh.getGetroom_nos(), "1", "index");
		selectDropDown(pom.getSreachHotels().getGetroom_nos(), "1", "index");
	}

	@When("^user enter the checkin date in checkin filed$")
	public void user_enter_the_checkin_date_in_checkin_filed() throws Throwable {
		// sh.getGetcheckin().clear();
		// inputvaluetoElement(sh.getGetcheckin(), "30/11/2020");
		inputvaluetoElement(pom.getSreachHotels().getGetcheckin(), "30/11/2020");
	}

	@When("^User enter the checkout date in chekout filed$")
	public void user_enter_the_checkout_date_in_chekout_filed() throws Throwable {
//		sh.getGetcheckout().clear();
//		inputvaluetoElement(sh.getGetcheckout(), "01/12/2020");
		inputvaluetoElement(pom.getSreachHotels().getGetcheckout(), "30/12/2020");

	}

	@When("^User select adult per room in adult per room filed$")
	public void user_select_adult_per_room_in_adult_per_room_filed() throws Throwable {
		// selectDropDown(sh.getGetadults_nos(), "2", "index");
		selectDropDown(pom.getSreachHotels().getGetadults_nos(), "2", "index");
	}

	@When("^User select children per room in children per room filed$")
	public void user_select_children_per_room_in_children_per_room_filed() throws Throwable {
		// selectDropDown(sh.getGetchilds_nos(), "0", "index");
		selectDropDown(pom.getSreachHotels().getGetchilds_nos(), "0", "index");
	}

	@Then("^User clicks sreach button and verifies its navigates to next page$")
	public void user_clicks_sreach_button_and_verifies_its_navigates_to_next_page() throws Throwable {
		// click(sh.getSreach());
		click(pom.getSreachHotels().getSreach());

	}

	@When("^User click radio button$")
	public void user_click_radio_button() throws Throwable {
		// click(cp.getClickctnbtn());
		click(pom.getConfirmation().getClickradiobtn());
	}

	@Then("^User click continue button$")
	public void user_click_continue_button() throws Throwable {
		// click(cp.getClickctnbtn());
		click(pom.getConfirmation().getClickctnbtn());
	}

	@When("^User enters first name in  username textbox$")
	public void user_enters_first_name_in_username_textbox() throws Throwable {
		// inputvaluetoElement(pp.getFirstname(), "vinod");
		inputvaluetoElement(pom.getPayment().getFirstname(), "vinod");
	}

	@When("^User enter last name in last name textbox$")
	public void user_enter_last_name_in_last_name_textbox() throws Throwable {
		// inputvaluetoElement(pp.getLastname(), "kumar");
		inputvaluetoElement(pom.getPayment().getLastname(), "kumar");

	}

	@When("^user enters address in address filed$")
	public void user_enters_address_in_address_filed() throws Throwable {
		// inputvaluetoElement(pp.getAddress(), "#62, Muthapudupet, IAF Avadi");
		inputvaluetoElement(pom.getPayment().getAddress(), "#62, Muthapudupet, IAF Avadi");
	}

	@When("^User enters the card_no in card textbox$")
	public void user_enters_the_card_no_in_card_textbox() throws Throwable {
		// inputvaluetoElement(pp.getCcnum(), "1234123412341234");
		inputvaluetoElement(pom.getPayment().getCcnum(), "1234123412341234");
	}

	@When("^User selects the card type from card type filed$")
	public void user_selects_the_card_type_from_card_type_filed() throws Throwable {
		// selectDropDown(pp.getCctype(), "3", "index");
		selectDropDown(pom.getPayment().getCctype(), "3", "index");
	}

	@When("^User selects the month from expiry date filed$")
	public void user_selects_the_month_from_expiry_date_filed() throws Throwable {
		// selectDropDown(pp.getCcexpmonth(), "March", "text");

		selectDropDown(pom.getPayment().getCcexpmonth(), "March", "text");

	}

	@When("^User selects the year from expiry date filed$")
	public void user_selects_the_year_from_expiry_date_filed() throws Throwable {
		// selectDropDown(pp.getCcexpyear(), "2022", "text");
		selectDropDown(pom.getPayment().getCcexpyear(), "2022", "text");
	}

	@When("^User enters the cvv_no in cvv_no filed$")
	public void user_enters_the_cvv_no_in_cvv_no_filed() throws Throwable {
		// inputvaluetoElement(pp.getCvvnum(), "123");
		inputvaluetoElement(pom.getPayment().getCvvnum(), "123");
	}

	@Then("^User clicks the book now button and verifies its navigates to next page$")
	public void user_clicks_the_book_now_button_and_verifies_its_navigates_to_next_page() throws Throwable {
		// click(pp.getBooknow());
		click(pom.getPayment().getBooknow());
	}

	@Then("^user clicks logut_btn and verifies its navigates out of application$")
	public void user_clicks_logut_btn_and_verifies_its_navigates_out_of_application() throws Throwable {
		// click(lo.getLogout());
		click(pom.getLogout().getLogout());
	}

}
