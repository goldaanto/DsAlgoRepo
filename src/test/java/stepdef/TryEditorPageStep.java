package stepdef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPageObject;
import pageobject.TryEditorPageObject;
import util.ExcelData;
import util.ExcelReader;

public class TryEditorPageStep {
	
	WebDriver driver = null;
	TryEditorPageObject pageEle = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList<Object> dataList = null;
	ArrayList<Object> data = null;
	
	@Given("User is on the Try Editor Page")
	public void user_is_on_the_try_editor_page() throws IOException {
		driver = HookPages.getDriver();
		
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		pageEle = new TryEditorPageObject(driver);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\tryeditordata.xlsx");
		
	}

//	@When("User enters the Python statement in the editor")
//	public void user_enters_the_python_statement_in_the_editor() {
//		pageEle.setTextAreaValue();
//	   
//	}
	
	@When("User enters data from {string} and {int}")
	public void user_enters_data_from_and(String string, Integer int1) {
				
		dataList = xcelRead.getData(string);
		System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJ"+dataList.size());
		
		data =  (ArrayList) dataList.get(int1);
		System.out.println("datadatadatadatadatadatadatadatadatadatadata"+data.size());
		
		
		String statement = (String) data.get(0);
		
		System.out.println("statementstatementstatementstatementstatementstatementstatement"+statement);
		
		
		pageEle.setTextAreaValue(statement);
		
	}

	

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		pageEle.clickRun();
	}

	@Then("Statement will be executed and Result shown")
	public void statement_will_be_executed_and_result_shown() {
	   
	}

	@Then("Popup Window displayed with error msg")
	public void popup_window_displayed_with_error_msg() {
	   
	}




}
