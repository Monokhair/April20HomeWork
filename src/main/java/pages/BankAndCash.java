package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCash extends BasePage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANKCASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEWACCOUNT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement BALANCE_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement BANKING_URL_ELELMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON_ELELMENT;

	public BankAndCash(WebDriver driver) {
		this.driver = driver;
	}

	public void click_BankCash() {

		addWaitTime(BANKCASH_ELEMENT);
		BANKCASH_ELEMENT.click();

	}

	public void click_newaccount() {
		addWaitTime(NEWACCOUNT_ELEMENT);
		NEWACCOUNT_ELEMENT.click();

	}

	public void enterTheaccounttitle(String account_title) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		ACCOUNT_TITLE_ELELMENT.sendKeys(account_title);
	}

	public void enterTheDescription(String account_description) {
		DESCRIPTION_ELELMENT.clear();
		DESCRIPTION_ELELMENT.sendKeys(account_description);
	}

	public void enterTheBalanceintial(String balance_intial) {
		BALANCE_ELELMENT.clear();
		BALANCE_ELELMENT.sendKeys(balance_intial);
	}

	public void enterTheAccountNumber(String account_Number) {
		ACCOUNT_NUMBER_ELELMENT.clear();
		ACCOUNT_NUMBER_ELELMENT.sendKeys(account_Number );
	}

	public void enterTheContackPersone(String contact_person) {
		CONTACT_PERSON_ELELMENT.clear();
		CONTACT_PERSON_ELELMENT.sendKeys(contact_person);
	}

	public void enterThePhoneNumber(String phoneNumber) {
		PHONE_ELELMENT.clear();
		PHONE_ELELMENT.sendKeys(phoneNumber);
	}

	public void entertheBankingURL(String Banking_URL) {
		BANKING_URL_ELELMENT.clear();
		BANKING_URL_ELELMENT.sendKeys(Banking_URL);
	}

	public void click_submit() {
		SUBMIT_BUTTON_ELELMENT.isEnabled();
		SUBMIT_BUTTON_ELELMENT.click();

	}

}
