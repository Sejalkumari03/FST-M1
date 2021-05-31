package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity3 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void open_browser() {
		driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");			
	}
		@Test 
		public void get_first_copyright() {
			WebElement copyright= driver.findElement(By.id("admin_options"));
			System.out.println("First copyright of the page is: " + copyright.getText());
			}
		
	@AfterMethod
	public void close_browser() {
		driver.close();
	}
}


	

