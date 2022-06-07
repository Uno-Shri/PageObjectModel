package Tests;

import javax.lang.model.element.Element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleLoginPage;

public class GoogleSearch_Test {

	
	private static WebDriver driver =null; //to make it common to all the function of the class
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GoogleSearch();
		
	}

	
	
	public static void GoogleSearch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shrikewale/git/Uno-Automation-Java2/Unosquare_UI _Automation/drivers/chromedriver");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		GoogleLoginPage.SearchTextbox(driver).sendKeys("facebook");
		
		Thread.sleep(2000);
		GoogleLoginPage.ClickSearch(driver).sendKeys(Keys.RETURN);
		System.out.println("Done");
		
		
		
		
		
	}
}
