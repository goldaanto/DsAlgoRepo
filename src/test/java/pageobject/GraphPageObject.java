package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button") WebElement button_loc;
	
	//Action
	public void clickGraphLink()
	{
		graph_loc.click();
		
	}
	
	public void setTextAreaValue(String param)
	{
		//String param = "Print("+"NumpyNinja"+")";
		WebElement codeMirror_loc= driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror_loc.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtArea = codeMirror_loc.findElement(By.cssSelector("textarea"));
		txtArea.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		txtArea.sendKeys(param);
		
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
		try_loc.click();
	}
	
	public void clickRun()
	{
		button_loc.click();
	}
}
