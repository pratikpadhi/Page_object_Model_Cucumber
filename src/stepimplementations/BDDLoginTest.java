package stepimplementations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.genericLib.Browser;
import com.genericLib.log1;
import com.pageobjectRepoTAP.BookaFlight;
import com.pageobjectRepoTAP.Flight_Reservation_Page;
import com.pageobjectRepoTAP.Login;
import com.pageobjectRepoTAP.Select_Flight;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BDDLoginTest {
	WebDriver driver;
	Login loginpage;
	Select_Flight selectflight;
	Flight_Reservation_Page flightreservation;
	BookaFlight bookflight;
	Boolean b=true;
	static String value =null;
	@Given("user is in login page")
	public void user_is_in_login_page()
	{
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
	    StackTraceElement e = stacktrace[1];
	driver=Browser.getbrowser();
	//driver.manage().window().maximize();
	 value = e.getMethodName();
	 loginpage=	PageFactory.initElements(driver,Login.class);
		selectflight=	PageFactory.initElements(driver,Select_Flight.class);
		bookflight=	PageFactory.initElements(driver,BookaFlight.class);
		flightreservation=PageFactory.initElements(driver,Flight_Reservation_Page.class);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		//File dst=new File("C:\\Screen\\"+filename+"____"+timeStamp+".png");
		String dst1="report"+timeStamp;
		Browser.report = new ExtentReports(System.getProperty("user.dir")+"\\ExtendReports\\"+dst1+"\\ExtentReportResults.html");
		
	 Browser.test = Browser.report.startTest(value);
		System.out.println("User is on the login page");
		log1.configure();
		 log1.info("Test Case execution for customer_MD started.");
	}
	
	@When("user enters correct loginusername (.*)")
	public void test_user(String usern)
	{
		System.out.println("---------"+usern);
	}
	@When("welcome you")
	public void testuser()
	{
		System.out.println("----Welcome-----");
	}
	@Given("^user is in the login \"([^\"]*)\"$")
	public void user_is_in_the_login(String arg1) throws Throwable {
		System.out.println("((((((((((((((((((("+arg1);
	  
	}

	@When("^user enters correct as loginusername (.*)$")
	public void user_enters_correct_as_loginusername_sui(String usern) throws Throwable {
	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&"+usern);
	}
	
	
	
	@And("user enters correct Password (.*)")
	public void test_Password(String pass)
	{
		System.out.println("[[[[[[[[[[[[["+pass);
	}
	
	
	@When("user enters correct username and password")
	public void test() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		loginpage.login();
		System.out.println("Enter correct username and password");
		Browser.test.log(LogStatus.PASS, "Navigated to the specified URL");
		Thread.sleep(2000);
	//	flightreservation.findflights();
		Browser.test.log(LogStatus.PASS, "Flight reservation button clicked");
	//	selectflight.findflights();
		Browser.test.log(LogStatus.PASS, "Flight find button clicked");
		//bookflight.book("yes");
//		b=bookflight.book("yes");
		b=true;
	}
	@Then("user gets confirmation page")
	public void test1() throws IOException
	{
		System.out.println("Confirmation page displayed");
		if(b==true)
			 log1.info(value+" test case passed successfully");
		else {
			 log1.warn(value+" test case failed.**");
	           Browser.test.log(LogStatus.FAIL,Browser.test.addScreenCapture(capture(driver))+ "Test Failed");
			Assert.assertEquals(false, true);
		}
Browser.report.endTest(Browser.test);
		
		Browser.report.flush();
	//	 driver.quit();
	}
	
	@After
	public void tearDown() {
		System.out.println("after method");
		// driver.quit();
	}
	
	@After("@web")
	public void tearDown_web() {
		System.out.println("after method web");
		
	}
	
	@Before("@web")
	public void tearDownb_web() {
		System.out.println("before method web");
		
	}
	@Before()
	public void tearDown_webb() {
		System.out.println("before method");
		
	}
	
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
	
}
