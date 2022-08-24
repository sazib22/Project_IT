package Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {

	
	@CucumberOptions (

	 features = {"Feature"},
	 glue = "Stepdef",
	 tags= "@signup1,@signup2"
	 )
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}
			

		
}
