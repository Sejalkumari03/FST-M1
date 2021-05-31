package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.training-support.net/selenium/dynamic-controls");
				
	    WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Is the input enabled ? " +input.isEnabled());
		
		
		 driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		 System.out.println("Is the input enabled? " +input.isEnabled());
		 
		Thread.sleep(3000);
		driver.close();

	}
}




