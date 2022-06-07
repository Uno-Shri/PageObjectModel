package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchTest2 {
private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("in second main");
		searchTest2();
		
		
	}
public static void searchTest2() throws InterruptedException
{  

	
	System.setProperty("webdriver.chrome.driver", "/Users/shrikewale/git/Uno-Automation-Java2/Unosquare_UI _Automation/drivers/chromedriver");
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.google.com/");

	System.out.println("done in second main2");
	
	// method level objects are created 
	GoogleSearchPageObject obj = new GoogleSearchPageObject(driver); // if u use public void GoogleSearchPageObject , it shall givr error.

	System.out.println("done in second main3");
	obj.setTextBox("a b c d");
	
	Thread.sleep(2000);// without it gives elmnt not interactable error
	obj.clickSearchButton();
	
	System.out.println("done in second main end");
	
//this.driver = driver;

}
}