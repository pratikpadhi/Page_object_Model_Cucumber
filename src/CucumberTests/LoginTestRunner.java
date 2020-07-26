package CucumberTests;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty" ,"html:target/html"},
		//format = {"pretty" ,"json:target/json/output.json"},
		format = {"pretty" ,"json:target/json/output.json","html:target/html"},
		//tags= {"@web"},
		features="features" ,glue="stepimplementations")
public class LoginTestRunner {

}
