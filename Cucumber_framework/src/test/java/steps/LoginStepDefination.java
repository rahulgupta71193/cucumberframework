package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;


public class LoginStepDefination
 {
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions= new CarSearchPageActions();
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		SeleniumDriver.openPage("https://qa-fake.herokuapp.com/");
		Thread.sleep(5000);
	}

	@When("^title of login page is QA Fake$")
	public void title_of_login_page_is_QA_Fake() throws Throwable {
		SeleniumDriver.verifyTitle("QA Fake");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		 System.out.println(username);
		SeleniumDriver.enterValue("username", username);
		 System.out.println(password);
		SeleniumDriver.enterValue("password", password);
		
	}

	@Then("^user checked rember me$")
	public void user_checked_rember_me() throws Throwable {
		SeleniumDriver.clickCheckbox("rememberme");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		SeleniumDriver.clickButton("/html/body/div/div/button");
	}

	@Then("^user get the secret string on home screen$")
	public void user_get_the_secret_string_on_home_screen() throws Throwable {
		SeleniumDriver.getResult("/html/body/div/div/div");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		SeleniumDriver.tearDown();
	   
	}





}
