package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

public static void main(String[] args) {
	        
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.training-support.net/selenium/dynamic-controls");
			        
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println(checkbox.getText());
		System.out.println("Is the checkbox selected? " +checkbox.isSelected());
		
		checkbox.click();
		System.out.println("Is the checkbox selected? " +checkbox.isSelected());
			
		driver.close();

	}
}


