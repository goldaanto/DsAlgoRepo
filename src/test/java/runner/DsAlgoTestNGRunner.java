package runner;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import hook.BrowserManger;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@CucumberOptions(features= "C:\\Users\\golda\\git\\DsAlgoProject\\DsAlgoProject\\src\\test\\resources\\Features", glue={"stepdef",})

@CucumberOptions(features="src/test/resources/Features", 
					glue={"stepdef","hook"},
					plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
					)
//dsalog Runner
public class DsAlgoTestNGRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	@Parameters({"browser"})
	public static void BeforeClass(String browsername)
	{
		System.out.println("browsernamebrowsernamebrowsername"+browsername);
		BrowserManger.setBrowserName(browsername);
				
	}
	
	public static void AfterClass()
	{
		
	}

}
