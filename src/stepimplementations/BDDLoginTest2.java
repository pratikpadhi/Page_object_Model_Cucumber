package stepimplementations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import com.genericLib.Browser;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class BDDLoginTest2 {
	WebDriver driver;
	
	
	@Given("^I will use data table$")
	public void i_will_use_data_table(DataTable arg1) throws Throwable {
		driver=Browser.getbrowser();
		List<List<String>> data=arg1.raw();
	    System.out.println("^^^^^^^^^^^^^^^^^"+data.get(0).get(0));
	    System.out.println("^^^^^^^^^^^^^^^^^"+data.get(0).get(1));
	    System.out.println("^^^^^^^^^^^^^^^^^"+data.get(1).get(0));
	    System.out.println("^^^^^^^^^^^^^^^^^"+data.get(1).get(1));
	    
	}
	
	
}
