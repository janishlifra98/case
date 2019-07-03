package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Cart {
	WebDriver driver;
int num;
	@Given("User opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("the user gives the uname as {string}  and pasword as {string}")
	public void the_user_gives_the_uname_as_and_pasword_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string2);
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@When("the user searches for the product")
	public void the_user_searches_for_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("myInput")).sendKeys("head");	
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	}

	@When("moves to the cart without selecting any product")
	public void moves_to_the_cart_without_selecting_any_product() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		num=driver.findElements(By.partialLinkText("Cart")).size();
	}

	@Then("verify whether product is added to the cart or not")
	public void verify_whether_product_is_added_to_the_cart_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	if(num==0)
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	
	}
	}


}
