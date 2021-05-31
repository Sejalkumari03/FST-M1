package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Email']/following-sibling::input")).sendKeys("abc_email@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        
        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        Thread.sleep(4000);
        
        driver.close();
	}

}
