package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
		
	@BeforeMethod
	public void open_browser() {
		driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");			
	}
	
	     @Test
	     public void navigation_color() {
			WebElement usn= driver.findElement(By.className("form-control"));
			WebElement pwd= driver.findElement(By.id("username_password"));
			WebElement login= driver.findElement(By.xpath("//input[@id='bigbutton']"));
			usn.sendKeys("admin");
			pwd.sendKeys("pa$$w0rd");
			login.click();
	    
			String nav_color= driver.findElement(By.xpath("//div[@class='navbar-header']")).getCssValue("color");
			System.out.println("color of the navigation: " + nav_color);
		   	}
		
	@AfterMethod
	public void close_browser() {
	driver.close();
		
	}
}
