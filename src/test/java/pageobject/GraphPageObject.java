package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPageObject {
	
	//Graph
	//Graph Representations
	
	
	WebDriver driver = null;
	//constructor
	public GraphPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	
	@FindBy(linkText = "Graph") WebElement graph_loc;
	
	@FindBy(linkText = "Graph Representations") WebElement graph_rep_loc;
	
	@FindBy(linkText = "Practice Questions") WebElement practice_loc;
	
	@FindBy(linkText = "Try here>>>") WebElement try_loc;
	
	//Action
	public void clickGraphLink()
	{
		graph_loc.click();
		
	}
	
	public void clickGraphRepLink()
	{
		graph_rep_loc.click();
	}
	public void clickPracticeLink()
	{
		practice_loc.click();
	}
	
	public void clickTryLink()
	{
		practice_loc.click();
	}
}
