package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement toggle_button = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		toggle_button.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
	
		toggle_button.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
		 
		Thread.sleep(2000);
		 driver.close();
		 
	}
}
