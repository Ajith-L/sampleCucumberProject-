package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
 
	WebDriver driver;

@Given("user is on loginpage")
public void user_is_on_loginpage() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("user enter valid username and password")
public void user_enter_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}

@When("click login btn")
public void click_login_btn() {
    // Write code here that turns the phrase above into concrete actions
 WebElement btn=	driver.findElement(By.id("btnLogin"));
 btn.click();
}

@Then("The user should be navigeted to home page")
public void the_user_should_be_navigeted_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
  WebElement pt=   driver.findElement(By.partialLinkText("Admin"));
  if(pt.isDisplayed()) {
	  System.out.println("is displayed");
  }
}
}
