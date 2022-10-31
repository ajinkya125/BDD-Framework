package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "D:\\chaitu\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://classic.freecrm.com/index.html");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() {
	   driver.findElement(By.cssSelector(".btn.btn-small")).click();
	}

	@Then("^user is redirected to the homepage$")
	public void user_is_redirected_to_the_homepage() {
	driver.getPageSource().contains("Home");
	
	driver.close();
	}

}
