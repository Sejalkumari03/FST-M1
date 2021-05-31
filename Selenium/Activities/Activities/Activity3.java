package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		String title= driver.getTitle();
		System.out.println("Title is :" + title);
		
		WebElement firstname= driver.findElement(By.id("firstName")); 
		firstname.sendKeys("Akshat");
		
		WebElement lastname= driver.findElement(By.id("lastName")); 
		lastname.sendKeys("Kumar");
		
		WebElement email= driver.findElement(By.id("email")); 
		email.sendKeys("Akshatkr@gmail.com");
		
		driver.findElement(By.id("number")).sendKeys("1256426818");
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		Thread.sleep(4000); 
		driver.close();
		
	}

}
