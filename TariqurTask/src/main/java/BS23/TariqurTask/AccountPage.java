package BS23.TariqurTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="logout")
	WebElement SignOutButton;
	
	@FindBy(xpath="(//A[@href='http://automationpractice.com/index.php?id_category=8&controller=category'][text()='Dresses'])[2]")
	WebElement DressesButton;
	
	
	@FindBy(xpath="(//IMG[@class='replace-2x'])[3]")
	WebElement SummerDressesButton;
	
	@FindBy(xpath="(//SPAN[text()='Add to cart'])[1]")
	WebElement Addtocart1Button;
	
	@FindBy(xpath="//SPAN[@class='cross']")
	WebElement ContinueShopingButton;
	
	@FindBy(xpath="(//SPAN)[102]")
	WebElement Addtocart2Button;
	
	@FindBy(xpath="(//SPAN)[35]")
	WebElement ProceedCheckoutButton;
	
	@FindBy(xpath="(//SPAN)[77]")
	WebElement ProceedCheckoutButton1;
	
	@FindBy(xpath="(//SPAN)[48]")
	WebElement ProceedCheckoutButton2;
	
	@FindBy(xpath="//INPUT[@id='cgv']")
	WebElement AgreeCheckbox;
	
	@FindBy(xpath="(//SPAN)[42]")
	WebElement ProceedCheckoutButton3;
	
	@FindBy(xpath="//A[@class='bankwire']")
	WebElement BankwireButton;
	
	@FindBy(xpath="(//SPAN)[40]")
	WebElement ConfirmOrderButton;
	
	@FindBy(id="summary_products_quantity")
	WebElement ProductQuantity;
	
	public void click_signout_button() {
		SignOutButton.click();
	}
	
	public void click_dresses_button() {
		DressesButton.click();
	}
	
	public void click_summer_dresses_button() {
		SummerDressesButton.click();
	}
	
	public void click_addtocart1st_button() {
		Addtocart1Button.click();
	}
	
	public void click_continueshop_button() {
		ContinueShopingButton.click();
	}
	
	public void click_addtocart2nd_button() {
		Addtocart2Button.click();
	}
	
	public void click_ProceedCheckout_button() {
		ProceedCheckoutButton.click();
	}
	
	public void click_ProceedCheckout1_button() {
		ProceedCheckoutButton1.click();
	}
	
	public void click_ProceedCheckout2_button() {
		ProceedCheckoutButton2.click();
	}
	
	public void click_agreecheckbox_button() {
		AgreeCheckbox.click();
	}
	
	public void click_ProceedCheckout3_button() {
		ProceedCheckoutButton3.click();
	}
	
	public void click_bankwire_button() {
		BankwireButton.click();
	}
	
	public void click_confirmorder_button() {
		ConfirmOrderButton.click();
	}
	
	public String verify_Successfull_reg() {
		String text=SignOutButton.getText();
		return text;
	}
	
	public String verify_Product_Quantity() {
		String text=ProductQuantity.getText();
		return text;
	}
}
