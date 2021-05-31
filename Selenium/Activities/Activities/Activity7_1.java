package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
			
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        
        String login_message= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("login message is " +login_message);
       
        driver.close();
	}
}
