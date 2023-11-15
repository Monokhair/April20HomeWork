package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

	WebDriver driver;

	

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_ELEMENT;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[6]/a/span[1]")WebElement sale;


	public void enter_the_user_name(String username) {
		
		USER_NAME_ELEMENT.sendKeys(username);
		
	}

	public void enter_the_password(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void click_signin_button() {
		SIGNIN_BUTTON_ELEMENT.click();

	}
	


}
