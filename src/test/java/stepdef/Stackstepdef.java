package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hook.HookPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Stackpageobject;

public class Stackstepdef {
	 WebDriver driver=null;
	 
	 Stackpageobject stackpageobj = null;
     
	@Given("User is on Stack page")
	public void user_is_on_stack_page() {
		 driver = HookPages.getDriver();
			
			if (stackpageobj== null)
			{
				stackpageobj = new Stackpageobject(driver);
			}
			System.out.println("user is on stack page");
	}

	@When("user clicks on Scroll down button of Stack page")
	public void user_clicks_on_scroll_down_button_of_stack_page() {
		System.out.println("page scroll down successfully");
	}

	@Then("user is scroll down to the end of the Stack page")
	public void user_is_scroll_down_to_the_end_of_the_stack_page() {
		System.out.println("user views the stack page");
	}

	@When("User clicks on Operations in Stack Link")
	public void user_clicks_on_operations_in_stack_link() {
		stackpageobj.operationsinstack();
	}

	@Then("User navigated to Operations in Stack Page")
	public void user_navigated_to_operations_in_stack_page() {
		
		String text = driver.getTitle();
		   Assert.assertEquals(text, "Operations in Stack");
	}

	@When("User clicks on Implementation Link")
	public void user_clicks_on_implementation_link() {
		stackpageobj.Implementation();
	}

	@Then("User navigated to Implementation Page")
	public void user_navigated_to_implementation_page() {
		
		String text = driver.getTitle();
		   Assert.assertEquals(text, "Implementation");
	}

	@When("User clicks on Applications Link")
	public void user_clicks_on_applications_link() {
		stackpageobj.Applications();
	}

	@Then("User navigated to Applications Page")
	public void user_navigated_to_applications_page() {
		String text = driver.getTitle();
		   Assert.assertEquals(text, "Applications");
	}
	
	@Given("User is on Operation Stack Page")
	public void user_is_on_operation_stack_page() {
		driver = HookPages.getDriver();
		
		if (stackpageobj== null)
		{
			stackpageobj = new Stackpageobject(driver);
		}
	}

	@When("User clicks on Sub Operations in Stack Link")
	public void user_clicks_on_sub_operations_in_stack_link() {
		stackpageobj.operationsinstack();
	}

	@When("User clicks on Sub Implementation Link")
	public void user_clicks_on_sub_implementation_link() {
		stackpageobj.Implementation();
	}

	@When("User clicks on Sub Applications Link")
	public void user_clicks_on_sub_applications_link() {
		stackpageobj.Applications();
	}

	@When("User clicks on Sub Practice Link")
	public void user_clicks_on_sub_practice_link() {
	    stackpageobj.clickPractice();
	}

	@Then("User navigated to Practice Page")
	public void user_navigated_to_practice_page() {
		String text = driver.getTitle();
		   Assert.assertEquals(text, " Practice Questions ");
	}
	
	@When("User clicks on Sub Try Here link")
	public void user_clicks_on_sub_try_here_link() {
		stackpageobj.clicktryLink();
	}



}
