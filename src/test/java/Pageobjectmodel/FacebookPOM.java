package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPOM {
    
	WebDriver driver;
	public  FacebookPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	
	@FindBy(name="firstname")
	public WebElement first_name;
	
	
	@FindBy(name="lastname")
	public WebElement last_name;
	
	
	@FindBy(name="reg_email__")
	public WebElement email;
	
	
	@FindBy(id="password_step_input")
	public WebElement passwprd;
	
	
	@FindBy(name="birthday_month")
	public WebElement select_month;
	
	
	@FindBy(id="day")
	public WebElement select_date;
	
	
	@FindBy(id="year")
	public WebElement select_year;
	
	
	@FindBy(name="sex")
	public WebElement select_gender;	
	
	
	@FindBy(name="websubmit")
	public WebElement click_sign_up;
}
