package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hook.HookPages;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LinkedListPageObject;

public class LinkedListPageStep {
		
	LinkedListPageObject llPageObject = null;
	
	WebDriver driver = null;
	
		
	@Given("User is on LinkedList Page")
	public void user_is_on_linked_list_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
		llPageObject = new LinkedListPageObject(driver);
		
	}


	@Then("user clicks on Introduction link")
	public void user_clicks_on_introduction_link() throws InterruptedException {
		Thread.sleep(2000);	
		llPageObject.click_Intro();
	}

	@Then("user is navigated to Introduction page")
	public void user_is_navigated_to_introduction_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Introduction", title);
		
	}

	@When("user clicks on Create LinkedList link")
	public void user_clicks_on_create_linked_list_link() {
		
		llPageObject.click_Create();
	   
	}

	@Then("user is navigated to Create LinkedList page")
	public void user_is_navigated_to_create_linked_list_page() throws InterruptedException {
		
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Creating Linked LIst", title);
	   
	}

	@When("user clicks on Types LinkedList link")
	public void user_clicks_on_types_linked_list_link() throws InterruptedException {
		Thread.sleep(2000);	
		llPageObject.click_TypeOf();
	}

	@Then("user is navigated to Types LinkedList page")
	public void user_is_navigated_to_types_linked_list_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Types of Linked List", title);
	    
	}

	@When("user clicks on Implement LinkedList link")
	public void user_clicks_on_implement_linked_list_link() throws InterruptedException {
		Thread.sleep(2000);	
		llPageObject.click_Implement();
	}

	@Then("user is navigated to Implement page")
	public void user_is_navigated_to_implement_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implement Linked List in Python", title);
	    
	}

	@When("user clicks on Traversal LinkedList link")
	public void user_clicks_on_traversal_linked_list_link() throws InterruptedException {
		Thread.sleep(2000);	
		llPageObject.click_traverse();
	}

	@Then("user is navigated to Traversal page")
	public void user_is_navigated_to_traversal_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Traversal", title);
	    
	}

	@When("user clicks on Insert LinkedList link")
	public void user_clicks_on_insert_linked_list_link() throws InterruptedException {
		Thread.sleep(2000);	
		llPageObject.click_Insert();
	}

	@Then("user is navigated to Insert page")
	public void user_is_navigated_to_insert_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Insertion", title);
	    
	}

	@When("user clicks on Delete LinkedList link")
	public void user_clicks_on_delete_linked_list_link() {
		llPageObject.click_Delete();
	}

	@Then("user is navigated to Delete page")
	public void user_is_navigated_to_delete_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Deletion", title);
	    
	}
	
	//Introduction Linked List Page

	@Given("User is on LinkedList Introduction page")
	public void user_is_on_linked_list_introduction_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
		llPageObject = new LinkedListPageObject(driver);
	}

	@When("user clicks on sub Introduction link")
	public void user_clicks_on_sub_introduction_link() {
		llPageObject.click_Intro_Intro();
	}

	@When("User clicks on sub creating LinkedList link")
	public void user_clicks_on_sub_creating_linked_list_link() {
		llPageObject.click_Intro_Create();
	}

	@When("User clicks on sub TypesOf LinkedList link")
	public void user_clicks_on_sub_types_of_linked_list_link() {
		llPageObject.click_Intro_TypeOf();
	}

	@When("User clicks on sub Implement link")
	public void user_clicks_on_sub_implement_link() {
		llPageObject.click_Intro_Implement();
	}

	@When("User clicks on Traverse sub LinkedList link")
	public void user_clicks_on_traverse_sub_linked_list_link() {
		llPageObject.click_Intro_traverse();
	}

	@When("User clicks on sub Insert LinkedList link")
	public void user_clicks_on_sub_insert_linked_list_link() {
		llPageObject.click_Intro_Insert();
	}

	@When("User clicks on sub Delete LinkedList link")
	public void user_clicks_on_sub_delete_linked_list_link() {
		llPageObject.click_Intro_Delete();
	}

	@When("User clicks on sub Practise Question link")
	public void user_clicks_on_sub_practise_question_link() {
		llPageObject.click_Intro_Practise();
		
		
	}

	@Then("User navigated to Practise Question page")
	public void user_navigated_to_practise_question_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Practice Questions", title);
	}

	@When("User clicks on sub Try Here link")
	public void user_clicks_on_sub_try_here_link() {
		
		llPageObject.click_Intro_tryhere();
	}

	@Then("User navigated to Try Editor page")
	public void user_navigated_to_try_editor_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
//Create Linked List Page
	
//	@Given("User is on LinkedList Create page")
//	public void user_is_on_linked_list_create_page() {
//		driver = HookPages.getDriver();
//		driver.get("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
//		llPageObject = new LinkedListPageObject(driver);
//	}
//
//	@Given("User is on LinkedList Implement page")
//	public void user_is_on_linked_list_implement_page() {
//		driver = HookPages.getDriver();
//		driver.get("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
//		llPageObject = new LinkedListPageObject(driver);
//	}
//	
//	@Given("User is on LinkedList TypesOf page")
//	public void user_is_on_linked_list_types_of_page() {
//		driver = HookPages.getDriver();
//		driver.get("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
//		llPageObject = new LinkedListPageObject(driver);
//	}
//	
//	@Given("User is on LinkedList Traverse page")
//	public void user_is_on_linked_list_traverse_page() {
//		driver = HookPages.getDriver();
//		driver.get("https://dsportalapp.herokuapp.com/linked-list/traversal/");
//		llPageObject = new LinkedListPageObject(driver);
//	}










}
