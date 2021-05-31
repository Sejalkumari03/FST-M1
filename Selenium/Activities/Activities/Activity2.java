package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String title = driver.getTitle();
		System.out.println("the title is " + title);
		
		WebElement idLocator= driver.findElement(By.id("about-link"));
		System.out.println("the id is "+ idLocator.getText());
		
		WebElement Classname= driver.findElement(By.className("green"));
		System.out.println("the class is "+ Classname.getText());
		
		WebElement text= driver.findElement(By.linkText("About Us"));
		System.out.println("the text is "+ text.getText());
		
		WebElement css= driver.findElement(By.cssSelector(".green"));
		System.out.println("the css is "+ css.getText());
		
		driver.close();
		
	}

}
