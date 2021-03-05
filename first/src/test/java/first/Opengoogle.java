package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengoogle {
	WebDriver driver;	
	WebElement search;
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
	  System.setProperty("webdriver.chrome.driver", "C:\\chrome drive\\driver_ves88\\88.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box( ) {
	    // Write code here that turns the phrase above into concrete actions
	   search=  driver.findElement(By.name("q"));
	}

	@When("types the search term as {string}")
	public void types_the_search_term_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
     search.sendKeys(string);
	}

	@Then("the user should see the search results for siva")
	public void the_user_should_see_the_search_results_for_siva() {
	    // Write code here that turns the phrase above into concrete actions
	 driver.close();
	  
	}

}
