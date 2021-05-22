package BS23.TariqurTask;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCases {

	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage (driver);
	AuthenticationPage authenticationpage = new AuthenticationPage(driver);
	RegistrationPage registrationpage = new RegistrationPage(driver);
	AccountPage accountpage = new AccountPage(driver);
	
	String email =RandomStringUtils.randomAlphabetic(10)+"@gmail.com";
	String email2 =RandomStringUtils.randomAlphabetic(10)+"@gmail.com";
	
	@BeforeTest
	public void before_test() throws IOException {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test(priority=1)
	public void reg_Positive() {
		homepage.click_signin();
		authenticationpage.provide_email_for_signup(email);
		authenticationpage.click_create_account_button();
		registrationpage.click_mr_radio_button();
		registrationpage.provide_cfname("cfname");
		registrationpage.provide_clname("clname");
		registrationpage.provide_password("12345");
		registrationpage.select_days();
		registrationpage.select_months();
		registrationpage.select_years();
		registrationpage.click_news_checkbox();
		registrationpage.click_offers_checkbox();
		registrationpage.provide_cname("cname");
		registrationpage.provide_address("add");
		registrationpage.provide_address2("add2");
		registrationpage.provide_city("city");
		registrationpage.select_states();
		registrationpage.provide_postcode("12345");
		registrationpage.provide_ai("additionalinfo");
		registrationpage.provide_homephone("123456789");
		registrationpage.provide_mobile("1234567890");
		registrationpage.click_register_button();
		Assert.assertEquals(accountpage.verify_Successfull_reg(), "Sign out");
		accountpage.click_signout_button();
	}
	@Test(priority=2)
	public void reg2nd_Positive() {
		homepage.click_signin();
		authenticationpage.provide_email_for_signup(email2);
		authenticationpage.click_create_account_button();
		registrationpage.click_mr_radio_button();
		registrationpage.provide_cfname("cfname");
		registrationpage.provide_clname("clname");
		registrationpage.provide_password("12345");
		registrationpage.select_days();
		registrationpage.select_months();
		registrationpage.select_years();
		registrationpage.click_news_checkbox();
		registrationpage.click_offers_checkbox();
		registrationpage.provide_cname("cname");
		registrationpage.provide_address("add");
		registrationpage.provide_address2("add2");
		registrationpage.provide_city("city");
		registrationpage.select_states();
		registrationpage.provide_postcode("12345");
		registrationpage.provide_ai("additionalinfo");
		registrationpage.provide_homephone("123456789");
		registrationpage.provide_mobile("1234567890");
		registrationpage.click_register_button();
		Assert.assertEquals(accountpage.verify_Successfull_reg(), "Sign out");
		accountpage.click_signout_button();
	}
	
	@Test(priority=3)
	public void purchase() throws InterruptedException {
		authenticationpage.provide_email_for_login(email);
		authenticationpage.provide_password("12345");
		authenticationpage.click_signin_button();
		accountpage.click_dresses_button();
		accountpage.click_summer_dresses_button();
		Thread.sleep(3000);
		accountpage.click_addtocart1st_button();
		Thread.sleep(3000);
		accountpage.click_continueshop_button();
		Thread.sleep(3000);
		accountpage.click_addtocart2nd_button();
		Thread.sleep(3000);
		accountpage.click_ProceedCheckout_button();
		Assert.assertEquals(accountpage.verify_Product_Quantity(), "2 Products");
		Thread.sleep(3000);
		accountpage.click_ProceedCheckout1_button();
		Thread.sleep(3000);
		accountpage.click_ProceedCheckout2_button();
		Thread.sleep(3000);
		accountpage.click_agreecheckbox_button();
		Thread.sleep(3000);
		accountpage.click_ProceedCheckout3_button();
		Thread.sleep(3000);
		accountpage.click_bankwire_button();
		Thread.sleep(3000);
		accountpage.click_confirmorder_button();

	}
	@AfterTest
	public void after_test() {
		driver.close();
	}
}
