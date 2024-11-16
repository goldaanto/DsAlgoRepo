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

import pageobject.RegisterPageObject;
import util.ExcelData;
import util.ExcelReader;

public class RegisterPageStep {
	
	WebDriver driver = null;
	RegisterPageObject  pageObject = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList dataList = null;
	ExcelData data = null;
	
	@Given("I go to the Registration page")
	public void i_go_to_the_registration_page() throws InterruptedException, IOException {
		driver = BrowserManger.StartBrowser();
		pageObject = new RegisterPageObject(driver);
		driver.get("https://dsportalapp.herokuapp.com/register");
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\registerdata.xlsx");
		 data = xcelRead.getRegisterData(sheetName);
		Thread.sleep(2000);
	}

	
	
	@When("user enters the username, password and confirm password")
	public void user_enters_the_username_password_and_confirm_password() throws InterruptedException {
		
		String username = data.getUsername();
		String password = data.getPassword();
		String cnfPassword = data.getCnfPassword();
		System.out.println("usernameusernameusernameusername"+username);
		System.out.println("passwordpasswordpasswordpassword"+password);
		System.out.println("passwordpasswordpasswordpassword"+cnfPassword);
			
		pageObject.setUserName(username);
		pageObject.setPassword1(password);
		pageObject.setPassword2(cnfPassword);
		Thread.sleep(2000);
	}
	
	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
		WebElement submitele = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		submitele.submit();
	}
	
	@Then("user  navigated to the home page")
	public void user_navigated_to_the_home_page() {
		driver.close();
	   driver.quit();
	}

}
