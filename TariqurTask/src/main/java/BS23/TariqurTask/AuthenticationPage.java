package BS23.TariqurTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
	
	WebDriver driver;
	public AuthenticationPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//INPUT[@id='email_create']")
	WebElement EmailTextbox;
	
	@FindBy(xpath="(//SPAN)[29]")
	WebElement CreateAccountButton;
	
	@FindBy(xpath="//INPUT[@id='email']")
	WebElement LoginEmailTextbox;
	
	@FindBy(xpath="//INPUT[@id='passwd']")
	WebElement PasswordTextbox;
	
	@FindBy(xpath="(//SPAN)[31]")
	WebElement SigninButton;
	
	public void provide_email_for_signup(String email) {
		EmailTextbox.sendKeys(email);
	}
	
	public void click_create_account_button() {
		CreateAccountButton.click();
	}
	
	public void provide_email_for_login(String email) {
		LoginEmailTextbox.sendKeys(email);
	}
	
	public void provide_password(String pass) {
		PasswordTextbox.sendKeys(pass);
	}
	
	public void click_signin_button() {
		SigninButton.click();
	}
}
