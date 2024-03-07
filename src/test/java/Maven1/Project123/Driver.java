package Maven1.Project123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	   private static WebDriver driver; // Static variable to hold the driver instance

	    public static WebDriver getWebDriver() {
	        if (driver == null) {
	        	driver = initializeWebDriver();
	        }
	        return driver;
	    }

	    private static WebDriver initializeWebDriver() {
	        // Set the path to the ChromeDriver executable
	        driver=new ChromeDriver();
	        return driver;
	    }
}
