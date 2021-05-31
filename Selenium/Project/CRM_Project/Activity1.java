package CRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void open_Browser() {
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void get_title() {
		String title= driver.getTitle(); 
		System.out.println("title of the page is : " +title);	
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");
		}
	
	
	@AfterMethod
	public void close_browser() {
		driver.close();
	}
}
	


	

	


