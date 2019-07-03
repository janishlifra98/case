package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Search {
	WebDriver driver;
	@Given("user opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();

	}

	@When("the user enters valid username as {string} and password as {string}")
	public void the_user_enters_valid_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string2);

	}

	@When("clicks on login")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@When("user searches for a product")
	public void user_searches_for_a_product() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
driver.findElement(By.id("myInput")).sendKeys("head");	
Actions actions=new Actions(driver);
actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}

	@When("user clicks on find details")
	public void user_clicks_on_find_details() {
	    // Write code here that turns the phrase above into concrete actions
//driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("verify the search product is displayed")
	public void verify_the_search_product_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		String actual=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
		String expected="Headphone";
		Assert.assertEquals(expected, actual);
	}


}
