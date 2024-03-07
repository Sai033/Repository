package Maven1.Project123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SecondTest extends BaseClass {
	WebDriver d=Driver.getWebDriver();
@Test
public void walk() {
	d.findElement(By.xpath("//input[@id='UserName']")).sendKeys("SG21433");
	d.findElement(By.xpath("//input[@id='Pasword']")).sendKeys("Sai@033614");
	d.findElement(By.xpath("//input[@id='btnLogIn']")).click();
}
}
