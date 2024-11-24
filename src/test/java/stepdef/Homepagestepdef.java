package stepdef;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepageobject;



public class Homepagestepdef extends BaseStep{
	
	//private Homepageobject homeObject = null;

//	@Given("the user is in the Home page")
//	public void the_user_is_in_the_home_page(){
//		driver.get(urlhome);
//		homeObject = new Homepageobject(driver);
//		setHomeObject(homeObject);
//		System.out.println("user is in the homepage");
//	}

	@When("the user clicks on the Data Structure Dropdown icon")
	public void the_user_clicks_on_the_data_structure_dropdown_icon() {
		homeObject.dropdown();
	}

	@Then("User will view six different types of data structures lists")
	public void user_will_view_six_different_types_of_data_structures_lists() {
		System.out.println("user sees six different types of lists in dropdown");
	}

//	
//	@Given("User is in the home page")
//	public void user_is_in_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		homeObject.DSgetstarted();
	}

	@Then("user receives a error message")
	public void user_receives_a_error_message() {
		System.out.println("You are not logged in "); 
	}
	

@Given("User is in the home page")
public void user_is_in_the_home_page() {
	driver.get(urlhome);
	if (homeObject == null)
	{
		homeObject = new Homepageobject(driver);
		setHomeObject(homeObject);
	}
	
	System.out.println("user is in the homepage");
   
}

@When("user clicks the DataStruct Get Started button")
public void user_clicks_the_data_struct_get_started_button() throws InterruptedException {
	System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
	homeObject.dataGetStarted();
	Thread.sleep(2000);
}

@Then("User navigated to DataStruct page")
public void user_navigated_to_data_struct_page() {
	
}

@When("user clicks the Array Get Started button")
public void user_clicks_the_array_get_started_button() {
	homeObject.arrayGetStarted();
}

@Then("User navigated to array page")
public void user_navigated_to_array_page() {
   
}

@When("user clicks the Linked Get Started button")
public void user_clicks_the_linked_get_started_button() {
	homeObject.linkedGetStarted();
}

@Then("User navigated to LinkedList page")
public void user_navigated_to_linked_list_page() {
   
}

@When("user clicks the Stack Get Started button")
public void user_clicks_the_stack_get_started_button() {
	homeObject.stackGetStarted();
}

@Then("User navigated to Stack page")
public void user_navigated_to_stack_page() {
   
}

@When("user clicks the Queue Get Started button")
public void user_clicks_the_queue_get_started_button() {
	homeObject.queueGetStarted();
}

@Then("User navigated to Tree page")
public void user_navigated_to_tree_page() {
    
}

@When("user clicks the Tree Get Started button")
public void user_clicks_the_tree_get_started_button() {
	homeObject.treeGetStarted();
}

@When("user clicks the Graph Get Started button")
public void user_clicks_the_graph_get_started_button() {
	homeObject.graphGetStarted();
    
}

@When("user clicks on SignIn Link")
public void user_clicks_on_sign_in_link() throws InterruptedException {
	Thread.sleep(3000);
	homeObject.clickSignIn();
	
}

@Then("user navigated to the login Page")
public void user_navigated_to_the_login_page() {
    
}

@When("user clicks on Register Link")
public void user_clicks_on_register_link() {
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	homeObject.clickRegister();
}

@Then("user navigated to the Register Page")
public void user_navigated_to_the_register_page() {
   
}

@Then("User navigated to Graph page")
public void user_navigated_to_graph_page() throws InterruptedException {
	Thread.sleep(5000);	
	String title = driver.getTitle();
	Assert.assertEquals("Graph", title);
}




}
