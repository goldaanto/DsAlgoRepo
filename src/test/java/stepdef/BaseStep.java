package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import hook.HookPages;
import pageobject.Homepageobject;
import pageobject.LoginPageObject;
import pageobject.RegisterPageObject;

public class BaseStep {
	
	public WebDriver driver = null;
	public static  Homepageobject  homeObject = null;
	//public static LoginPageObject loginObject = null;
	public static Homepageobject getHomeObject() {
		return homeObject;
	}

	public static void setHomeObject(Homepageobject homeObject) {
		BaseStep.homeObject = homeObject;
	}

	public static LoginPageObject pageObject = null;
	public final String  url = "https://dsportalapp.herokuapp.com/register";
	public final String  urlhome = "https://dsportalapp.herokuapp.com/home";
	
	public BaseStep()
	{
		driver = HookPages.getDriver();		
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
	}

}
