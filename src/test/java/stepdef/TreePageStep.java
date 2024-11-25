package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LinkedListPageObject;
import pageobject.TreePageObject;

public class TreePageStep {
	WebDriver driver = null;
	TreePageObject treePageObject = null;

	@Given("User is on Tree page")
	public void user_is_on_tree_page() {
		driver = HookPages.getDriver();
		if(treePageObject == null)
		{
			treePageObject = new TreePageObject(driver);
		}
	}

	@Given("User is on Overview Sub page")
	public void user_is_on_overview_sub_page() {
		driver = HookPages.getDriver();
		if(treePageObject == null)
		{
			treePageObject = new TreePageObject(driver);
		}
	}
	

	@When("User clicks on Tree Overview Link")
	public void user_clicks_on_tree_overview_link() {
		treePageObject.clickOverviewLink();
	}

	@Then("User navigated to Overview Trees Page")
	public void user_navigated_to_overview_trees_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Overview of Trees", title);
	}

	@When("User clicks on Terminologies Link")
	public void user_clicks_on_terminologies_link() {
		treePageObject.clickTerminologiesLink();
	}

	@Then("User navigated to Terminologies Page")
	public void user_navigated_to_terminologies_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Terminologies", title);


	}

	@When("User clicks on Types Trees Link")
	public void user_clicks_on_types_trees_link() {
		treePageObject.clickTypesOfLink();
	}

	@Then("User navigated to Types Trees Page")
	public void user_navigated_to_types_trees_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Types of Trees", title);

	}

	@When("User clicks on Traversals Link")
	public void user_clicks_on_traversals_link() {
		treePageObject.clickTraversalsLink();
	}

	@Then("User navigated to Traversal Page")
	public void user_navigated_to_traversal_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Tree Traversals", title);

	}

	@When("User clicks on Illustration Link")
	public void user_clicks_on_illustration_link() {
		treePageObject.clickIllustrationLink();
	}

	@Then("User navigated to Illustration Page")
	public void user_navigated_to_illustration_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Traversals-Illustration", title);

	}

	@When("User clicks on Binary tree Link")
	public void user_clicks_on_binary_tree_link() {
		treePageObject.clickBinaryLink();
	}

	@Then("User navigated to Binary Tree Page")
	public void user_navigated_to_binary_tree_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Binary Trees", title);

	}

	@When("User clicks on Types Binary Link")
	public void user_clicks_on_types_binary_link() {
		treePageObject.clickTypesBinaryLink();
	}

	@Then("User navigated to Types Binary Page")
	public void user_navigated_to_types_binary_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Types of Binary Trees", title);

	}

	@When("User clicks on Impl Python Link")
	public void user_clicks_on_impl_python_link() {
		treePageObject.clickImplPythonLink();
	}

	@Then("User navigated to Impl Python Page")
	public void user_navigated_to_impl_python_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation in Python", title);

	}

	@When("User clicks on Binary Traversals Link")
	public void user_clicks_on_binary_traversals_link() {
		treePageObject.clickBinaryTraversalLink();
	}

	@Then("User navigated to Binary Traversal Page")
	public void user_navigated_to_binary_traversal_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Binary Tree Traversals", title);

	}

	@When("User clicks on Impl Binary  TreesLink")
	public void user_clicks_on_impl_binary_trees_link() {
		treePageObject.clickImplBinaryLink();
	}

	@Then("User navigated to Impl Binary Page")
	public void user_navigated_to_impl_binary_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation of Binary Trees", title);

	}	

	@When("User clicks on Appl Binary tree Link")
	public void user_clicks_on_appl_binary_tree_link() {
		treePageObject.clickApplyBinaryLink();
	}

	@Then("User navigated to Application Binary Page")
	public void user_navigated_to_application_binary_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Applications of Binary trees", title);

	}

	@When("User clicks on Binary Search Link")
	public void user_clicks_on_binary_search_link() {
		treePageObject.clickBinarySearchLink();
	}

	@Then("User navigated to Binary Search Page")
	public void user_navigated_to_binary_search_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Binary Search Trees", title);

	}

	@When("User clicks on Impl Binary  Search Link")
	public void user_clicks_on_impl_binary_search_link() {
		treePageObject.clickImplBSTLink();
	}

	@Then("User navigated to Impl BinarySearch Page")
	public void user_navigated_to_impl_binary_search_page() throws InterruptedException {
		Thread.sleep(2000);	
		String title = driver.getTitle();
		Assert.assertEquals("Implementation Of BST", title);

	}

	@Given("User is on Overview Tree page")
	public void user_is_on_overview_tree_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@When("User clicks on Tree Practice Questions Link")
	public void user_clicks_on_tree_practice_questions_link() {
		treePageObject.click_practice_quest_Link();
	}

	@Then("User navigated to Tree Practice  Page")
	public void user_navigated_to_tree_practice_page() {

	}

	@When("User clicks on sub tree Try Here link")
	public void user_clicks_on_sub_tree_try_here_link() {
		treePageObject.click_try_here_link();
	}

	@Then("User navigated to Assessment  Page")
	public void user_navigated_to_assessment_page() {

	}

	@Given("User is on Terminologies Tree page")
	public void user_is_on_terminologies_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/terminologies/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on TypesOf Tree page")
	public void user_is_on_types_of_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/types-of-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Traversals Tree page")
	public void user_is_on_traversals_tree_page() {
		driver = HookPages.getDriver();
	//	driver.get("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Illustrations Tree page")
	public void user_is_on_illustrations_tree_page() {
		driver = HookPages.getDriver();
	//	driver.get("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Binary Tree page")
	public void user_is_on_binary_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/binary-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Types Binary Tree page")
	public void user_is_on_types_binary_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Imple Python Tree page")
	public void user_is_on_imple_python_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Binary Traversal Tree page")
	public void user_is_on_binary_traversal_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("/https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
		treePageObject = new TreePageObject(driver); 
	}

	@Given("User is on Imple Binary Tree page")
	public void user_is_on_imple_binary_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Application Binary Tree page")
	public void user_is_on_application_binary_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
		treePageObject = new TreePageObject(driver); 
	}

	@Given("User is on Binary Search Tree page")
	public void user_is_on_binary_search_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
		treePageObject = new TreePageObject(driver);
	}

	@Given("User is on Impl BST Tree page")
	public void user_is_on_impl_bst_tree_page() {
		driver = HookPages.getDriver();
		//driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
		treePageObject = new TreePageObject(driver);
	}


}
