package packages2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class New {
	@Test
	public void methodA() {
	System.out.println("1");
	}
	@BeforeMethod
	public void methodB() {
		System.out.println("2");
	}
	@AfterMethod
	public void methodC() {
		System.out.println("3");
	}
}
