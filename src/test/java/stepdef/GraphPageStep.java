package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.GraphPageObject;
//https://dsportalapp.herokuapp.com/graph/
import pageobject.TreePageObject;

public class GraphPageStep {
	WebDriver driver = null;
	GraphPageObject graphPageObject = null;

@Given("User is on Graph Page")
public void user_is_on_graph_page() {
	
	driver = HookPages.getDriver();
	driver.get("https://dsportalapp.herokuapp.com/graph/");
	graphPageObject = new GraphPageObject(driver);
   
}

@When("User clicks on Graph link")
public void user_clicks_on_graph_link() {
	graphPageObject.clickGraphLink();
}

@Then("User navigated to Graph page")
public void user_navigated_to_graph_page() throws InterruptedException {
	Thread.sleep(5000);	
	String title = driver.getTitle();
	Assert.assertEquals("Graph", title);
}

@When("User clicks on Graph Represent link")
public void user_clicks_on_graph_represent_link() {
	graphPageObject.clickGraphRepLink();
}

@Given("User is on Sub Graph Page")
public void user_is_on_sub_graph_page() {
	driver = HookPages.getDriver();
	driver.get("https://dsportalapp.herokuapp.com/graph/graph/");
	graphPageObject = new GraphPageObject(driver);
   
}

@Then("User navigated to Graph Represent page")
public void user_navigated_to_graph_represent_page() throws InterruptedException {
	Thread.sleep(5000);	
	String title = driver.getTitle();
	Assert.assertEquals("Graph Representations", title);
}

@Then("User navigated to Try Here page")
public void user_navigated_to_try_here_page() throws InterruptedException {
	Thread.sleep(5000);	
	String title = driver.getTitle();
	Assert.assertEquals("Assessment", title);
}

@Given("User is on Sub Graph Represent page")
public void user_is_on_sub_graph_represent_page() {
	
	driver = HookPages.getDriver();
	driver.get("https://dsportalapp.herokuapp.com/graph/graph-representations/");
	graphPageObject = new GraphPageObject(driver);
    
}


@When("User clicks on Graph Practise Test link")
public void user_clicks_on_graph_practise_test_link() {
	graphPageObject.clickPracticeLink();
}

@When("User clicks on Graph Try Here link")
public void user_clicks_on_graph_try_here_link() {
	graphPageObject.clickGraphLink();
}


}
