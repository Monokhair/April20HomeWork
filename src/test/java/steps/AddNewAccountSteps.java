package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import pages.BankAndCash;
import pages.BasePage;
import pages.LoginPage;

public class AddNewAccountSteps extends BasePage{

	LoginPage loginPage;
	BankAndCash bankAndCash;

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String mockData, String field) {
	  switch (field) {
	  case "accountTitle":
		  bankAndCash =PageFactory.initElements(driver, BankAndCash.class);
		  bankAndCash.enterTheaccounttitle(mockData);
		  break;
	  case "description":
		  bankAndCash.enterTheDescription(mockData);
		  break;
	  case "initialBalance":
		  bankAndCash.enterTheBalanceintial(mockData);
		  break;
	  case "accountNumber":
		  bankAndCash.enterTheAccountNumber(mockData+randomNumberGenerator(9999));
		  break;
	  case "contactPerson":
		  bankAndCash.enterTheContackPersone(mockData);
		  break;
	  case "Phone":
		  bankAndCash.enterThePhoneNumber(mockData+randomNumberGenerator(9999));
		  break;
	  case "internetBankingURL":
		  bankAndCash.entertheBankingURL(mockData);
		  takeScreenshot(driver);
		  break;
	  
	  }
	}


	@Then("User should be able to validate account created successfully")
	public boolean  user_should_be_able_to_validate_account_created_successfully() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actuleMassage= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]")).getText();
		String expectedMassage = "×\r\n" + "Account Created Successfully";
		if (actuleMassage.equalsIgnoreCase(expectedMassage)) {
			return true;
			
		}
		takeScreenshot(driver);
		teardown();
		
		return false;
		
	 
	}

}
