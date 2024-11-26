package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Arraypageobject;


public class Arraystepdef {
	WebDriver driver=null;
	Arraypageobject pageobject=null;


	@Given("User is on Array page")
	public void user_is_on_dsintropage() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/array/");
		if(pageobject== null)
		{
			pageobject = new Arraypageobject(driver);
		}

		System.out.println("user is on array page");
	}

	@When("user clicks on Scroll down button of array page")
	public void user_clicks_on_scroll_down_button_of_array_page() {
		System.out.println("page scroll down successfully");
	}


	@Then("user is scroll down to the end of the array page")
	public void user_is_scroll_down_to_the_end_of_the_array_page() {
		System.out.println("user views the array page");
	}


	@When("User clicks on Arrays in Python Link")
	public void user_clicks_on_arrays_in_python_link() {
		pageobject.arrayinpython();
	}

	@Then("User navigated to Arrays in Python Page")
	public void user_navigated_to_arrays_in_python_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Arrays in Python");
	}

	@When("User clicks on Arrays Using List Link")
	public void user_clicks_on_arrays_using_list_link() {
		pageobject.arrayusinglist();
	}

	@Then("User navigated to Arrays Using List Page")
	public void user_navigated_to_arrays_using_list_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Arrays Using List");
	}

	@When("User clicks on Basic Operations in Lists Link")
	public void user_clicks_on_basic_operations_in_lists_link() {
		pageobject.basicoperations();
	}

	@Then("User navigated to Basic Operations in Lists Page")
	public void user_navigated_to_basic_operations_in_lists_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Basic Operations in Lists");
	}

	@When("User clicks on Applications of Array Link")
	public void user_clicks_on_applications_of_array_link() {
		pageobject.applicationarray();
	}

	@Then("User navigated to Applications of Array Page")
	public void user_navigated_to_applications_of_array_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Applications of Array");
	}
	
	@Given("User is on Sub Array page")
	public void user_is_on_sub_array_page() {
		driver = HookPages.getDriver();		
		if(pageobject== null)
		{
			pageobject = new Arraypageobject(driver);
		}
		
	}

	@When("User clicks on Sub Arrays in Python Link")
	public void user_clicks_on_sub_arrays_in_python_link() {
		pageobject.clickSubArrayPython();
	}

	@When("User clicks on Sub Arrays Using List Link")
	public void user_clicks_on_sub_arrays_using_list_link() {
		pageobject.clickSubArrayIn();
	}

	@When("User clicks on Sub Basic Operations in Lists Link")
	public void user_clicks_on_sub_basic_operations_in_lists_link() {
		pageobject.clickSubBasicOp();
	}

	@When("User clicks on Sub Applications of Array Link")
	public void user_clicks_on_sub_applications_of_array_link() {
		pageobject.clickSubApplication();
	}

	
	@When("User clicks on Arrays Phython Try Here link")
	public void user_clicks_on_arrays_phython_try_here_link() {

		pageobject.clickTryhere();
	}
	
	@When("User clicks on Arrays Using Try Here link")
	public void user_clicks_on_arrays_using_try_here_link() {
		pageobject.clickTryhere();
	}

	@When("User clicks on Basic Operations Try Here link")
	public void user_clicks_on_basic_operations_try_here_link() {
		pageobject.clickTryhere();
	}

	@When("User clicks on Application Array Try Here link")
	public void user_clicks_on_application_array_try_here_link() {
		pageobject.clickTryhere();
	}




}
