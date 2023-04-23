package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Log.Log;


public class Tests {
	String url="http://colorstreet.com";
	String driverPath="..\\Colorstreet\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
@BeforeSuite
public void goTo() {
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void starting() {
	Log start=new Log(driver);
	start.Cookies();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='language']/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]")));
	start.SelectCountry();
	start.LogIn();
	start.Create();
	
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[6]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
	start.Code("12");   	 // The number provided 1215 to test generated an error
	start.CodeSearch();
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Select')]")));
	start.CodeSelect();
	
	start.FName("Maria");
	start.LName("Perez");
	start.Password("asdfgh");
	start.ConfPassword("asdfgh");
	start.NoRobot();
	start.FinalSubmit();
}

@AfterSuite
	public void cerrarPagina() {
	driver.close();
}
}


