package stepdef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPageObject;
import util.ExcelData;
import util.ExcelReader;

public class LoginPageStep {


	WebDriver driver = null;
	LoginPageObject  pageObject = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList<Object> dataList = null;
	ArrayList data = null;

	@Given("I go to the login page")
	public void i_go_to_the_login_page() throws IOException {
		
		
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\logindata.xlsx");
		//dataList = xcelRead.getLoginData(sheetName);
	}
	
	@When("user enters the Incorrect username and password")
	public void user_enters_the_incorrect_username_and_password() throws InterruptedException {
		pageObject = new LoginPageObject(driver);
		dataList = xcelRead.getData(sheetName);
		System.out.println("dataListdataListdataListdataListdataListdataListdataList"+dataList.size());
		data = (ArrayList) dataList.get(0);
		System.out.println("datadatadatadatadatadatadatadatadata"+data);
		String username = (String) data.get(0);
		String password = (String) data.get(1);
		System.out.println("usernameusernameusernameusername"+username);
		System.out.println("passwordpasswordpasswordpassword"+password);
		pageObject.setUsername(username);
		pageObject.setPassword(password);
		
		Thread.sleep(10000);
	}

	
	
	@When("user inputs data from {string} and {int}")
	public void user_inputs_data_from_and(String string, Integer int1) throws InterruptedException {
		pageObject = new LoginPageObject(driver);
		dataList = xcelRead.getData(string);
		System.out.println("dataListdataListdataListdataListdataListdataListdataList"+dataList.size());
		data =  (ArrayList) dataList.get(int1);
		System.out.println("data.size()data.size()data.size()data.size()"+data.size());
		String username = (String) data.get(0);
		String password = (String) data.get(1);
		System.out.println("usernameusernameusernameusername"+username);
		System.out.println("passwordpasswordpasswordpassword"+password);
		pageObject.setUsername(username);
		pageObject.setPassword(password);
		
		Thread.sleep(10000);
	}

	
	@Then("user remains on login page")
	public void user_remains_on_login_page() throws InterruptedException {
	    String title = driver.getTitle();
	    Assert.assertEquals(" Login ", title);
	    Thread.sleep(5000);
	}

	@Then("Invalid username error message is displayed")
	public void invalid_username_error_message_is_displayed() throws InterruptedException {
		
//		Assert.assertEquals("Invalid Username and Password", "Invalid Username and Password");
//	    Thread.sleep(2000);
		
	}



//	@When("user enters the username and password")
//	public void user_enters_the_username_and_password() throws InterruptedException {
//		pageObject = new LoginPageObject(driver);
//		data = (ExcelData) dataList.get(1);
//		String username = data.getUsername();
//		String password = data.getPassword();
//		pageObject.setUsername(username);
//		pageObject.setPassword(password);
//		
//		Thread.sleep(2000);
//	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		pageObject.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		if(pageObject.checkInHomePage())
		{
			Thread.sleep(5000);			
			//driver.close();
		}
	}
	


	





}
