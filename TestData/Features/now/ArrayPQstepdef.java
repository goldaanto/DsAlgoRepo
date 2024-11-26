package stepdef;

import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.ArrayPQpageobject;


public class ArrayPQstepdef {
	WebDriver driver=null;
    ArrayPQpageobject pageobject=null;
    
	@Given("User is on practice questions page")
	public void user_is_on_practice_questions_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/array/practice");
		pageobject = new ArrayPQpageobject(driver);
		System.out.println("user is on array practice question page");
	}

	@When("User clicks on Search the array Link")
	public void user_clicks_on_search_the_array_link() {
	    pageobject.searcharray();
	}

	@Then("User navigated to Search the array Page")
	public void user_navigated_to_search_the_array_page() {
		System.out.println("user is on Search the array page");
	}

	@When("User clicks on Max Consecutive Ones Link")
	public void user_clicks_on_max_consecutive_ones_link() {
	   pageobject.max();
	}

	@Then("User navigated to Max Consecutive Ones Page")
	public void user_navigated_to_max_consecutive_ones_page() {
		System.out.println("user is on Max Consecutive Ones page");
	}

	@When("User clicks on Find Numbers with Even Number of Digits Link")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_link() {
	    pageobject.even();
	}

	@Then("User navigated to Find Numbers with Even Number of Digits Page")
	public void user_navigated_to_find_numbers_with_even_number_of_digits_page() {
		System.out.println("user is on Find Numbers with Even Number of Digits Page");
	}

	@When("User clicks on Squares of  a Sorted Array Link")
	public void user_clicks_on_squares_of_a_sorted_array_link() {
	    pageobject.squares();
	}

	@Then("User navigated to Squares of  a Sorted Array Page")
	public void user_navigated_to_squares_of_a_sorted_array_page() {
		System.out.println("user is on squares of sorted array page");
	}



}
