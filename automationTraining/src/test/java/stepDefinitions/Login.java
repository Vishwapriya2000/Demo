package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {

		WebDriver driver;
		@Given("I launch Chrome browser")
		public void i_launch_chrome_browser() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\Chrome driver\\chromedriver-win64\\chromedriver.exe" );
			driver = new ChromeDriver();
		    throw new io.cucumber.java.PendingException();
		}

		@And("I navigate to OrangeHRM website")
		public void i_navigate_to_orange_hrm_website() {
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    throw new io.cucumber.java.PendingException();
		}

		@When("I enter username and password")
		public void i_enter_username_and_password() {
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		    throw new io.cucumber.java.PendingException();
		}

		@And("I click on Login button")
		public void i_click_on_login_button() {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		    throw new io.cucumber.java.PendingException();
		}

		
		@Then("Page loads and naviagtes to Home Page")
		public void page_loads_and_naviagtes_to_home_page() {
			boolean status = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
			Assert.assertEquals(true, status);
		    throw new io.cucumber.java.PendingException();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
