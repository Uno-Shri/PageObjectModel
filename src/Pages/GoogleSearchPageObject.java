package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObject {
	
	WebDriver driver =null; // no null is also fine , just to save some memories
	By textbox_search = By.name("q");
	
	By button_search= By.name("btnK");
	
	


	public GoogleSearchPageObject(WebDriver driver)
	{
	this.driver = driver;
	
	}

	
	
	public void setTextBox(String text) // dont want to  hardcore in function  .sendkey ("A B C D")
	{
		//this.driver=driver;
		driver.findElement(textbox_search).sendKeys(text);
	
	}
	public void clickSearchButton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);	}
}
