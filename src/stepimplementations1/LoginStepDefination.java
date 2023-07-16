package stepimplementations1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genericLib.Browser;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://qa-fake.herokuapp.com/");
		 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    
	}

	@When("^title of login page is QA Fake$")
	public void title_of_login_page_is_QA_Fake() throws Throwable {
		Thread.sleep(5000);
	   Assert.assertEquals("QA Fake", driver.getTitle());
	   
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	
		WebElement wb= driver.findElement(By.xpath("//input[@id='username']"));
	
		wb.sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
	   
	}

	@Then("^user checked rember me$")
	public void user_checked_rember_me() throws Throwable {
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	   
	}

	@Then("^user get the secret string on home screen$")
	public void user_get_the_secret_string_on_home_screen() throws Throwable {
		WebElement wb= driver.findElement(By.xpath("//div[@id='result']"));
		Thread.sleep(5000);
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter( "result.txt"));
		    writer.write( wb.getText());

		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
	   
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	   
	}

}
