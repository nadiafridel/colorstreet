package Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log {
	@FindBy(id="onetrust-accept-btn-handler")
	WebElement window;
	
	@FindBy(xpath="//body/div[@id='language']/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]")
	WebElement country;

	@FindBy(xpath="//a[contains(text(),'Log In')]")
	WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Create an account')]")
	WebElement create;

	@FindBy(xpath="//body/div[6]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cod;

	@FindBy(xpath="//body/div[6]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")  
	WebElement codsearch;

	@FindBy(xpath="//a[contains(text(),'Select')]")
	WebElement codselect;

	@FindBy(css="#Customer_FirstName")
	WebElement firstname;

	@FindBy(css="#Customer_LastName")
	WebElement lastname;

	@FindBy(xpath="//input[@id='Password']")
	WebElement password;

	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmpass;

	@FindBy(xpath="//div[@id='recaptcha']")
	WebElement robot;

	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;

	WebDriver driver;
	
	public Log(WebDriver driver)	{
	this.driver =driver;
	PageFactory.initElements(driver, this);
	}
	
	public void Cookies() {
		window.click();
	}
	public void SelectCountry() {
		country.click();
	}
	public void LogIn() {
		login.click();
	}
	
	public void Create() {
		create.click();
	}
	
	public void Code(String num) {
		cod.sendKeys(num);
	}
	
	public void CodeSearch() {
		codsearch.click();
	}

	public void CodeSelect() {
		codselect.click();
	}
	
	public void FName(String first) {
		firstname.sendKeys(first);
	}
	public void LName(String last) {
		lastname.sendKeys(last);
	}
	
	public void Password(String passw) {
		password.sendKeys(passw);
	}
	public void ConfPassword(String passw) {
		confirmpass.sendKeys(passw);
	}
	
	public void NoRobot() {
		robot.click();
	}
	
	public void FinalSubmit() {
		submit.click();
	}
	}

