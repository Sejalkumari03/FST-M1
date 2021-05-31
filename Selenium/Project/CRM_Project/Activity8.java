package CRM_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity8 {
	
WebDriver driver;
	
	@BeforeMethod
	public void open_Browser() {
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void Acounts_table_contents() throws InterruptedException {
    driver.findElement(By.className("form-control")).sendKeys("admin");
	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

	driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
	driver.findElement(By.xpath("//a[@id='moduleTab_9_Accounts']")).click();
	Thread.sleep(10000);
	for (int i=1; i<=9;i+=2){
		WebElement rows= driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[3]/b/a"));
		String names= rows.getText();
		System.out.println("Name of the " +i+ " row is :" + names );
		}
	}
		
	@AfterMethod
	public void close_browser() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
	}
}
