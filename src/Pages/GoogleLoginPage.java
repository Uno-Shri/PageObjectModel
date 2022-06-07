package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginPage {
	
	//WebDriver driver;
	private static WebElement Element=null;
	
	
	public  static WebElement SearchTextbox(WebDriver driver)
	
	
	{
		
		Element= driver.findElement(By.name("q"));
		//Element.sendKeys("POM TESTING");
		return Element;
		
		
	}
	public static WebElement ClickSearch(WebDriver driver)
	
	{
		Element= driver.findElement(By.name("btnK"));
		return Element;
	}
	

}
