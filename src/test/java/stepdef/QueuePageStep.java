package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LinkedListPageObject;
import pageobject.QueuePageObject;

public class QueuePageStep {
	
	WebDriver driver = null;
	QueuePageObject queuePageObject = null;
	
	@Given("User is on Queue page")
	public void user_is_on_queue_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/queue/");
		queuePageObject = new QueuePageObject(driver);
	    
	}

	@When("User clicks on Implement Queue link")
	public void user_clicks_on_implement_queue_link() {
		queuePageObject.clickQueueLink();
	}

	@Then("User navigated to Implementation Queue page")
	public void user_navigated_to_implementation_queue_page() throws InterruptedException {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation of Queue in Python", title);
	}

	@When("User clicks on Implement DeQue link")
	public void user_clicks_on_implement_de_que_link() {
		queuePageObject.clickDeQueLink(); 
	}

	@Then("User navigated to Implementation Collection page")
	public void user_navigated_to_implementation_collection_page() throws InterruptedException   {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using collections.deque", title);
	}

	@When("User clicks on Implement Array link")
	public void user_clicks_on_implement_array_link() {
		queuePageObject.clickArrayLink();
	}

	@Then("User navigated to Implement Array page")
	public void user_navigated_to_implement_array_page() throws InterruptedException {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using array", title);
	}

	@When("User clicks on Queue Operation link")
	public void user_clicks_on_queue_operation_link() {
		queuePageObject.clickOperationLink();
	}

	@Then("User navigated to  Queue Operation page")
	public void user_navigated_to_queue_operation_page() throws InterruptedException {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals("Queue Operations", title);
	}

	
	@Given("User is on Implement Queue page")
	public void user_is_on_implement_queue_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/queue/implementation-lists/");
		queuePageObject = new QueuePageObject(driver);
	}

	@When("User clicks on Practise Test link")
	public void user_clicks_on_practise_test_link() {
		queuePageObject.clickPractiseLink();
	}

	@Then("User navigated to Practise Test page")
	public void user_navigated_to_practise_test_page() throws InterruptedException {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals(" Practice Questions ", title);
	}

	@When("User clicks on Try Here link")
	public void user_clicks_on_try_here_link() {
		queuePageObject.clickTryHereLink();
	}

	@Then("User navigated to  Try Here page")
	public void user_navigated_to_try_here_page() throws InterruptedException {
		Thread.sleep(5000);	
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}



}
