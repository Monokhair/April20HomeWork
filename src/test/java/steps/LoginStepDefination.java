package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BankAndCash;
import pages.BasePage;
import pages.LoginPage;

public class LoginStepDefination extends BasePage {

	LoginPage loginPage;
	BankAndCash bankAndCash;

	@Before
	public void init() {
		setup();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankAndCash = PageFactory.initElements(driver, BankAndCash.class);

	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String Data, String Field) {

		switch (Field) {
		case ("username"):
			loginPage.enter_the_user_name(Data);
			break;
		case ("password"):
			loginPage.enter_the_password(Data);
			takeScreenshot(driver);
			break;
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		switch (button) {
		case "login":
			loginPage.click_signin_button();
			break;
		case "bankCash":

			bankAndCash.click_BankCash();
			break;
		case "newAccount":
			bankAndCash.click_newaccount();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			takeScreenshot(driver);
			break;
		case "submit":
			bankAndCash.click_submit();
			break;
		}

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String actule = driver.getTitle();
		String expected = "Dashboard- iBilling";
		validation(actule, expected);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		takeScreenshot(driver);
	}

}
