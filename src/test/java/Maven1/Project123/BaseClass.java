package Maven1.Project123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
WebDriver d;
	@BeforeClass
	public void launchBrowser() {
		d=Driver.getWebDriver();
	}
	@AfterClass
	public void closeBrowser() {
		d.close();
	}
	@BeforeMethod
	public void Login() {
		d.get("https://smartgig-ess.infionicone.com");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout successfull");
	}
	
}
