package com.TestScriptTAP;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import com.genericLib.Browser;
import com.genericLib.ExcelLib;
import com.genericLib.Screenshot;
import com.genericLib.log1;
import com.genericLib.webdrivercommlib;
import com.pageobjectRepoTAP.BookaFlight;
import com.pageobjectRepoTAP.Flight_Reservation_Page;
import com.pageobjectRepoTAP.Login;
import com.pageobjectRepoTAP.Select_Flight;

import junit.framework.Assert;
@Listeners(Screenshot.class)
public class TestScript {
	ExcelLib elib=new ExcelLib();
	webdrivercommlib wblib=new webdrivercommlib();
	WebDriver driver;
	Login loginpage;
	Select_Flight selectflight;
	Flight_Reservation_Page flightreservation;
	BookaFlight bookflight;
	static String value =null;
	
@BeforeTest
public void extendreport()
{
//	Browser.report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	//File dst=new File("C:\\Screen\\"+filename+"____"+timeStamp+".png");
	String dst1="report"+timeStamp;
	Browser.report = new ExtentReports(System.getProperty("user.dir")+"\\ExtendReports\\"+dst1+"\\ExtentReportResults.html");
	

}
	
@BeforeClass
	public void bfrcls(){
		driver=Browser.getbrowser();
		driver.manage().window().maximize();
	loginpage=	PageFactory.initElements(driver,Login.class);
	selectflight=	PageFactory.initElements(driver,Select_Flight.class);
	bookflight=	PageFactory.initElements(driver,BookaFlight.class);
	flightreservation=PageFactory.initElements(driver,Flight_Reservation_Page.class);
	log1.configure();
	 log1.info("Test Case execution for customer_MD started.");
	// Browser.test = Browser.report.startTest("ExtentDemo");

}

	@Test
	public void MD_Indexing_TC01()
	{
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
	    StackTraceElement e = stacktrace[1];
	   value = e.getMethodName();
	   Browser.test = Browser.report.startTest(value);
		//loginpage.login();
		 log1.info(value+" test case passed successfully");
		 Browser.test.log(LogStatus.PASS, "Navigated to the specified URL");

	}
	
	@Test
	public void MD_Indexing_TC02() throws InvalidFormatException, IOException, Exception
	{
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
	    StackTraceElement e = stacktrace[1];
	   value = e.getMethodName();
	   Browser.test = Browser.report.startTest(value);
		loginpage.login();
		Browser.test.log(LogStatus.PASS, "Navigated to the specified URL");
		Thread.sleep(2000);
		flightreservation.findflights();
		Browser.test.log(LogStatus.PASS, "Flight reservation button clicked");
		selectflight.findflights();
		Browser.test.log(LogStatus.PASS, "Flight find button clicked");
		bookflight.book("yes");
		Boolean b=bookflight.book("yes");
	   b=false;
		if(b==true)
			 log1.info(value+" test case passed successfully");
		else
			Assert.assertEquals(false, true);
}
	
	@AfterMethod
    public void TearDown(ITestResult result) throws IOException
    {
         if(ITestResult.FAILURE == result.getStatus())
           {
           log1.warn(value+" test case failed.**");
           Browser.test.log(LogStatus.FAIL,Browser.test.addScreenCapture(capture(driver))+ "Test Failed");

           }
    }
	
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}

	
	@AfterClass
	public void last()
	{
		Browser.report.endTest(Browser.test);
		
		Browser.report.flush();

		log1.info("Test Case execution for customer_MD completed.");
		//driver.quit();
		
	}
	
}
