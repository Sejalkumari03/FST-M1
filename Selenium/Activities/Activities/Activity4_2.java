package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of the page is : " +driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sejal");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumari");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8983011164");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("sejalkri@abc.com");
		driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
