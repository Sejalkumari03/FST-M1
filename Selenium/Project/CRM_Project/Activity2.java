package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity2 {
	WebDriver driver;
	
	@BeforeMethod
	public void open_Browser() {
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void get_url() {
		//WebElement title= driver.findElement(By.xpath("//*[@id='form']/div[1]/img"));
		WebElement title= driver.findElement(By.xpath("//*[@class='companylogo']/img"));
		System.out.println(title.getAttribute("src"));
		
	}
	
	@AfterMethod
	public void close_browser() {
		driver.close();
	}
}
	
