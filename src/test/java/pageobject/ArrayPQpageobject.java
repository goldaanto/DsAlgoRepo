package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPQpageobject {

	//constructor
			WebDriver driver = null;
			public ArrayPQpageobject(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
	}

	//locators
			
			@FindBy(linkText="Search the array")WebElement searcharray_loc;
			@FindBy(linkText="Max Consecutive Ones")WebElement max_loc;	
			@FindBy(linkText="Find Numbers with Even Number of Digits")WebElement even_loc;	
			@FindBy(linkText="Squares of  a Sorted Array")WebElement squares_loc;	
			
							
	//Action methods
			public  void searcharray()
			{
				searcharray_loc.click();
			}
			public void max()
			{
				max_loc.click();
			}
			public void even()
			{
				even_loc.click();
			}
			public void squares()
			{
				squares_loc.click();
			}
			

}
