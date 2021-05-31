package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("Title of page is : " +driver.getTitle());
		Thread.sleep(2000);
		
		WebElement changecontent_button= driver.findElement(By.xpath("//button[@onclick='loadText()']"));
		changecontent_button.click();
		 
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		WebElement Hello_text= driver.findElement(By.id("ajax-content"));
		System.out.println("the frst hello text is : " +Hello_text.getText());
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		String late_text= driver.findElement(By.id("ajax-content")).getText();
		System.out.println("the late text is : " +late_text);
		
		Thread.sleep(2000);
		driver.close();		
	}

}
