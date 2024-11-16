package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManger {
	
	public static WebDriver driver= null;
	public static String browserName = null;
	
	public String getBrowserName() {
		return browserName;
	}
	public static void setBrowserName(String name) {
		System.out.println("Insideddddddddddddd"+name);
		browserName=name;
	}

	public static WebDriver StartBrowser()
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
			
		return driver;
		
	}
	
	

}
