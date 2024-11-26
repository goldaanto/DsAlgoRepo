package runner;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import hook.BrowserManger;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.ExcelReader;



//@CucumberOptions(features= "C:\\Users\\golda\\git\\DsAlgoProject\\DsAlgoProject\\src\\test\\resources\\Features", glue={"stepdef",})

@CucumberOptions(features="src/test/resources/Features", 
					glue={"stepdef","hook"},
					plugin = 
				{"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber-reports/cucumber.json",
						"junit:target/cucumber-reports/cucumber.xml"
					
						}
					)
//dsalog Runner
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
public class DsAlgoTestNGRunner extends AbstractTestNGCucumberTests {
	static Logger logg = (Logger) LogManager.getLogger(ExcelReader.class);
	
	@BeforeTest
	@Parameters({"browser"})
	public static void BeforeClass(String browsername)
	{
		logg.info(browsername);
		
		BrowserManger.setBrowserName(browsername);
				
	}
	
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	public static void AfterClass()
	{
		
	}

}
