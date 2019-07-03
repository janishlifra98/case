package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import junit.framework.Assert;
import junit.framework.Assert;

public class Log {
	WebDriver driver;
	@Given("user enters the un as {string}")
	public void user_enters_the_un_as(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@Given("password as {string}")
	public void password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);

		}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	
	}

	@Then("verify successful login")
	public void verify_successful_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PndingException();
String actual="Home";
String expected=driver.getTitle();
		
Assert.assertEquals(actual,expected);
	System.out.println("Success");
	}


}
