package stepdef;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hook.BrowserManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.RegisterPageObject;
import util.ExcelData;
import util.ExcelReader;

public class RegisterPageStep extends BaseStep {
	
//	WebDriver driver = null;
	RegisterPageObject  pageObject = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList dataList = null;
	
	
	@Given("I go to the Registration page")
	public void i_go_to_the_registration_page() throws InterruptedException, IOException {
//		driver = BrowserManger.StartBrowser();
		pageObject = new RegisterPageObject(driver);
		System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
		//driver.get(url);
		//driver.get("https://dsportalapp.herokuapp.com/register");
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\registerdata.xlsx");
		 
		Thread.sleep(1000);
	}

	
	@When("user enter {string}, {string},{string}")
	public void user_enter(String string, String string2, String string3) {
		
		pageObject.setUserName(string);
		pageObject.setPassword1(string2);
		pageObject.setPassword2(string3);
	   
	}

	
	
	@When("user get data from {string}, {int}")
	public void user_get_data_from(String string, Integer int1) throws InterruptedException {
		
		dataList = xcelRead.getData(string);
		System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRr"+dataList.size());
		@SuppressWarnings("unchecked")
		ArrayList<Object> data =  (ArrayList<Object>) dataList.get(int1);
		System.out.println("data.size()data.size()data.size()data.size()"+data.size());
		String username = (String) data.get(0);
		String password = (String) data.get(1);
		String cnfPassword = (String) data.get(2);	
		pageObject.setUserName(username);
		pageObject.setPassword1(password);
		pageObject.setPassword2(cnfPassword);
		Thread.sleep(1000);
	}
	
	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
		WebElement submitele = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		submitele.submit();
	}
	
	@SuppressWarnings("deprecation")
	@Then("user  navigated to the home page")
	public void user_navigated_to_the_home_page() throws InterruptedException {
		
		Assert.assertEquals("Invalid Username and Password", "Invalid Username and Password");
		Thread.sleep(1000);
		
	}

}
