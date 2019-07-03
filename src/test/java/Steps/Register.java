package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import junit.framework.Assert;

public class Register {
WebDriver driver;
	@Given("user opens the testMeApp application")
	public void user_opens_the_testMeApp_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("the user opens the signup page")
	public void the_user_opens_the_signup_page() {
		//driver.findElement(By.linktext("signup")).click();
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("the user gives  username as {string}")
	public void the_user_gives_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("the user gives the firstname as {string}")
	public void the_user_gives_the_firstname_as(String string) {
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("the user gives the lastname as {string}")
	public void the_user_gives_the_lastname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(string);
	}

	@When("the user gives the password as {string}")
	public void the_user_gives_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);

	}

	@When("the user gives the confirm password as {string}")
	public void the_user_gives_the_confirm_password_as(String string) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(string);
	}

	@When("the user selects the gender as {string}")
	public void the_user_selects_the_gender_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions=new Actions(driver);

		actions.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().perform();
	}

	@When("the user gives the email as {string}")
	public void the_user_gives_the_email_as(String string) {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(string);
		}

	@When("the user gives the mobile number as {string}")
	public void the_user_gives_the_mobile_number_as(String string) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(string);
	}

	@When("the user gives the dob as {string}")
	public void the_user_gives_the_dob_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
// new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(string);
	}

	@When("the user gives the address as {string}")
	public void the_user_gives_the_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(string);
		}

	@When("the user selects the security question")
	public void the_user_selects_the_security_question() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Select qn=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		qn.selectByIndex(2);
	}

	@When("the user gives the answer as {string}")
	public void the_user_gives_the_answer_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  // new cucumber.api.PendingException();
	driver.findElement(By.name("answer")).sendKeys(string);;
	}

	@When("click register button")
	public void click_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
}

	@Then("verify register process")
	public void verify_register_process() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	String expected="Login";
		String actual=driver.getTitle();
		Assert.assertEquals(actual,expected);
	System.out.println("Verified");
	}
}









