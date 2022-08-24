package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pageobjectmodel.FacebookPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Facebook {

	WebDriver driver;
	@Given("^user can launchs urls$")
	public void user_can_launchs_urls() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe" )  ;  
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// Launch URL Facebook
	driver.get("https://www.facebook.com/reg/");
	
	}

	@Then("^user caan type \"([^\"]*)\"$")
	public void user_caan_type(String arg1) throws Throwable {
		 FacebookPOM obj=new  FacebookPOM(driver);
		 obj.first_name.sendKeys(arg1);
	}

	@Then("^user can \"([^\"]*)\"$")
	public void user_can(String arg1) throws Throwable {
		 FacebookPOM obj=new  FacebookPOM(driver);
		 obj.last_name.sendKeys(arg1);
	}

	@Then("^user can type \"([^\"]*)\"$")
	public void user_can_type(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.email.sendKeys(arg1);
	}
	
	@Then("^user can write \"([^\"]*)\"$")
	public void user_can_write(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.passwprd.sendKeys(arg1);
	}
	
	
	@Then("^user can select month and date and year$")
	public void user_can_select_month_and_date_and_year() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		Select sec=new Select(obj.select_month);
		sec.selectByVisibleText("May");
		Select let=new Select(obj.select_date);
		let.selectByIndex(30);
		Select call=new Select(obj.select_year);
		call.selectByVisibleText("2021");
	}

	@Then("^user can select genders$")
	public void user_can_select_genders() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.select_gender.click();
	}

	@Then("^user can click sign up$")
	public void user_can_click_sign_up() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.click_sign_up.click();
	}
	
	
	
	
	
	
	// second scenario validate with negative information condition-with out email
	
	
	
	@Given("^user can launch urll$")
	public void user_can_launch_urll() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe" )  ;  
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch URL Facebook
		driver.get("https://www.facebook.com/reg/");
		
	}

	@Then("^user caan write \"([^\"]*)\"$")
	public void user_caan_write(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		 obj.first_name.sendKeys(arg1);
	}

	@Then("^user can types \"([^\"]*)\"$")
	public void user_can_types(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		 obj.last_name.sendKeys(arg1);
	}

	@Then("^user can writee \"([^\"]*)\"$")
	public void user_can_writee(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.email.sendKeys(arg1);
	}

	@Then("^user cann writee \"([^\"]*)\"$")
	public void user_cann_writee(String arg1) throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.passwprd.sendKeys(arg1);
	}

	@Then("^user can selectt month and date and year$")
	public void user_can_selectt_month_and_date_and_year() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		Select sec=new Select(obj.select_month);
		sec.selectByVisibleText("May");
		Select let=new Select(obj.select_date);
		let.selectByIndex(30);
		Select call=new Select(obj.select_year);
		call.selectByVisibleText("2021");
	}

	@Then("^user can selectt genders$")
	public void user_can_selectt_genders() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.select_gender.click();
	}

	@Then("^user can clickk sign up$")
	public void user_can_clickk_sign_up() throws Throwable {
		FacebookPOM obj=new  FacebookPOM(driver);
		obj.click_sign_up.click();
	}
	
}
