package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	
	@BeforeMethod
	public void open_Browser() {
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void Leads_table_data() throws InterruptedException {
		    driver.findElement(By.className("form-control")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			
			driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
			driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']")).click();
			Thread.sleep(10000);
			for (int i=1; i<=10; i++){

				WebElement names_col= driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[3]/b/a"));
				WebElement user_col= driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[8]/a"));
				String name= names_col.getText();
				String username= user_col.getText();
						
				System.out.println("The value of Name and User of row " +i+ " is : " + name +" - " + username );
			}	
	}
	
			@AfterMethod
			public void close_browser() throws InterruptedException {
				Thread.sleep(8000);
				driver.close();
			}
}
		