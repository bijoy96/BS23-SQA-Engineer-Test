package BS23.TariqurTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//LABEL[@for='id_gender1']")
	WebElement MrRadio;
	
	@FindBy(xpath="//LABEL[@for='id_gender2']")
	WebElement MrsRadio;
	
	@FindBy(xpath="//INPUT[@id='customer_firstname']")
	WebElement FirstNameTextbox;
	
	@FindBy(xpath="//INPUT[@id='customer_lastname']")
	WebElement LastNameTextbox;
	
	@FindBy(xpath="//INPUT[@id='passwd']")
	WebElement PasswordTextbox;
	
	@FindBy(xpath="//SELECT[@id='days']")
	WebElement DaysDropdown;
	
	@FindBy(xpath="//SELECT[@id='months']")
	WebElement MonthsDropdown;
	
	@FindBy(xpath="//SELECT[@id='years']")
	WebElement YearsDropdown;
	
	@FindBy(xpath="//LABEL[@for='newsletter'][text()='Sign up for our newsletter!']")
	WebElement NewsletterCheckbox;
	
	@FindBy(xpath="//LABEL[@for='optin'][text()='Receive special offers from our partners!']")
	WebElement SpecialOfferCheckbox;
	
	@FindBy(xpath="//INPUT[@id='firstname']")
	WebElement AFirstNameTextbox;
	
	@FindBy(xpath="//INPUT[@id='lastname']")
	WebElement ALastNameTextbox;
	
	@FindBy(xpath="//INPUT[@id='company']")
	WebElement CompanyTextbox;
	
	@FindBy(xpath="//INPUT[@id='address1']")
	WebElement AddressTextbox;
	
	@FindBy(xpath="//INPUT[@id='address2']")
	WebElement Address2Textbox;
	
	@FindBy(xpath="//INPUT[@id='city']")
	WebElement CityTextbox;
	
	@FindBy(xpath="//SELECT[@id='id_state']")
	WebElement StateDropdown;
	
	@FindBy(xpath="//INPUT[@id='postcode']")
	WebElement PostCodeTextbox;
	
	@FindBy(xpath="//SELECT[@id='id_country']")
	WebElement CountryDropdown;
	
	@FindBy(xpath="//TEXTAREA[@id='other']")
	WebElement AdditionalTextbox;
	
	@FindBy(xpath="//INPUT[@id='phone']")
	WebElement HomePhoneTextbox;
	
	@FindBy(xpath="//INPUT[@id='phone_mobile']")
	WebElement MobileTextbox;
	
	@FindBy(xpath="//INPUT[@id='alias']")
	WebElement AddressAliasTextbox;
	
	@FindBy(xpath="(//SPAN)[42]")
	WebElement RegistrationButton;
	
	public void click_mr_radio_button() {
		MrRadio.click();
	}
	
	public void click_mrs_radio_button() {
		MrsRadio.click();
	}
	
	public void provide_cfname(String cfname) {
		FirstNameTextbox.sendKeys(cfname);
	}
	
	public void provide_clname(String clname) {
		LastNameTextbox.sendKeys(clname);
	}
	
	public void provide_password(String pass) {
		PasswordTextbox.sendKeys(pass);
	}
	
	public void select_days() {
		Select select = new Select(DaysDropdown);
		select.selectByValue("1");
	}
	
	public void select_months() {
		Select select = new Select(MonthsDropdown);
		select.selectByValue("1");
	}
	
	public void select_years() {
		Select select = new Select(YearsDropdown);
		select.selectByValue("1997");
	}
	
	public void click_news_checkbox() {
		NewsletterCheckbox.click();
	}
	
	public void click_offers_checkbox() {
		SpecialOfferCheckbox.click();
	}
	
	public void provide_fname(String fname) {
		AFirstNameTextbox.sendKeys(fname);
	}
	
	public void provide_lname(String lname) {
		ALastNameTextbox.sendKeys(lname);
	}

	public void provide_cname(String cname) {
		CompanyTextbox.sendKeys(cname);
	}
	
	public void provide_address(String add) {
		AddressTextbox.sendKeys(add);
	}
	
	public void provide_address2(String add2) {
		Address2Textbox.sendKeys(add2);
	}
	
	public void provide_city(String city) {
		CityTextbox.sendKeys(city);
	}
	
	public void select_states() {
		Select select = new Select(StateDropdown);
		select.selectByValue("10");
	}
	
	public void provide_postcode(String pcode) {
		PostCodeTextbox.sendKeys(pcode);
	}
	
	public void provide_ai(String ai) {
		AdditionalTextbox.sendKeys(ai);
	}
	
	public void provide_homephone(String homephone) {
		HomePhoneTextbox.sendKeys(homephone);
	}
	
	public void provide_mobile(String mobile) {
		MobileTextbox.sendKeys(mobile);
	}
	
	public void provide_addressalias(String addalias) {
		AddressAliasTextbox.sendKeys(addalias);
	}
	
	public void click_register_button() {
		RegistrationButton.click();
	}
}
