package stepdef;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.GraphPageObject;
//https://dsportalapp.herokuapp.com/graph/
import pageobject.TreePageObject;
import util.ExcelReader;

public class GraphPageStep {
	WebDriver driver = null;
	GraphPageObject graphPageObject = null;

@Given("User is on Graph Page")
public void user_is_on_graph_page() {
	
	driver = HookPages.getDriver();
	//driver.get("https://dsportalapp.herokuapp.com/graph/");
	if(graphPageObject==  null) {
		graphPageObject = new GraphPageObject(driver);
	}
	System.out.println("111111111111111111111111"+driver.getCurrentUrl());
   
}

@When("User clicks on Graph link")
public void user_clicks_on_graph_link() {
	graphPageObject.clickGraphLink();
	System.out.println("22222222222222222222222222222"+driver.getCurrentUrl());
}

//@Then("ser navigated to Graph page")
//public void user_navigated_to_graph_page() throws InterruptedException {
//	Thread.sleep(5000);	
//	String title = driver.getTitle();
//	Assert.assertEquals("Graph", title);
//}

@When("User clicks on Graph Represent link")
public void user_clicks_on_graph_represent_link() {
	graphPageObject.clickGraphRepLink();
	System.out.println("33333333333333333333333"+driver.getCurrentUrl());
}

@Given("User is on Sub Graph Page")
public void user_is_on_sub_graph_page() {
	driver = HookPages.getDriver();
	//driver.get("https://dsportalapp.herokuapp.com/graph/graph/");
	if(graphPageObject==  null) {
		graphPageObject = new GraphPageObject(driver);
	}
	System.out.println("4444444444444444444444444"+driver.getCurrentUrl());
}

@Then("User navigated to Graph Represent page")
public void user_navigated_to_graph_represent_page() throws InterruptedException {
		
	String title = driver.getTitle();
	Assert.assertEquals("Graph Representations", title);
}

@Then("User navigated to Try Here page")
public void user_navigated_to_try_here_page() throws InterruptedException {
	
	String title = driver.getTitle();
	Assert.assertEquals("Assessment", title);
}

@Given("User is on Sub Graph Represent page")
public void user_is_on_sub_graph_represent_page() {
	
	driver = HookPages.getDriver();
	//driver.get("https://dsportalapp.herokuapp.com/graph/graph-representations/");
	if(graphPageObject== null)
	{
		graphPageObject = new GraphPageObject(driver);
	}
	System.out.println("55555555555555555555555555555"+driver.getCurrentUrl());
}
@When("User clicks on Sub Graph link")
public void user_clicks_on_sub_graph_link() {
	
	graphPageObject.clickGraphLink();
	System.out.println("666666666666666666666666666666666"+driver.getCurrentUrl());
}

@When("User clicks on Sub Graph Represent link")
public void user_clicks_on_sub_graph_represent_link() {
	graphPageObject.clickGraphRepLink();
	System.out.println("7777777777777777777777777777777777777"+driver.getCurrentUrl());
}



@Then("User navigated to Graph Practise Test page")
public void user_navigated_to_graph_practise_test_page() {
	
}


@When("User clicks on Graph Practise Test link")
public void user_clicks_on_graph_practise_test_link() {
	graphPageObject.clickPracticeLink();
	System.out.println("7777777777777777777777777777777777777"+driver.getCurrentUrl());
}

@When("User clicks on Graph Try Here link")
public void user_clicks_on_graph_try_here_link() {
	graphPageObject.clickTryLink();
	System.out.println("9999999999999999999999999999999999999999999999999999997"+driver.getCurrentUrl());
	
}

@When("User clicks on Graph Represent Try Here link")
public void user_clicks_on_graph_represent_try_here_link() {
	graphPageObject.clickTryLink();
}

@When("User enters graph data from {string} and {int}")
public void user_enters_graph_data_from_and(String string, Integer int1) {
	ExcelReader xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\tryeditordata.xlsx");
	System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL"+ xcelRead);
	ArrayList dataList = xcelRead.getData(string);
	System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJ"+dataList.size());
	
	ArrayList data =  (ArrayList) dataList.get(int1);
	System.out.println("datadatadatadatadatadatadatadatadatadatadata"+data.size());
	
	
	String statement = (String) data.get(0);
	
	System.out.println("statementstatementstatementstatementstatementstatementstatement"+statement);
	System.out.println("statementstatement"+driver.getCurrentUrl());
	
	
graphPageObject.setTextAreaValue(statement);
	
}



@When("User clicks on graph Run button")
public void user_clicks_on_graph_run_button() {
	graphPageObject.clickRun();
}



@Then("graph Statement will be executed and Result shown")
public void graph_statement_will_be_executed_and_result_shown() {
   
}

}
