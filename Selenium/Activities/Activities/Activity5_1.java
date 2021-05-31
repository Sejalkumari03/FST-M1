package Activities;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Activity5_1 {

		public static void main(String[] args) {
		        
			WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.training-support.net/selenium/dynamic-controls");
				        
			WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
			System.out.println(checkbox.getText());
			System.out.println("Is the checkbox visible? " +checkbox.isDisplayed());
							
			driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
			System.out.println("Is the checkbox visible? " +checkbox.isDisplayed());
			
				
			driver.close();

		}
	}


