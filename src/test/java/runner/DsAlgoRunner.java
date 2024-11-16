package runner;


import org.junit.runner.RunWith;

import hook.BrowserManger;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features", glue={"stepdef","hook"},
				monochrome = true, 
				plugin= {"pretty","html:target/JSONReport/report.html"})
//dsalog Runner
public class DsAlgoRunner {
	
	

}
