package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/tables");
		System.out.println(driver.getTitle());

		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println("Number of columns are: " + cols.size());
				
		WebElement rows= driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
		System.out.println("size of the rows is : " +rows.getSize());
	
		WebElement third_row= driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]"));
		System.out.println("Data of the third row are: " + third_row.getText());
		
		WebElement second_row_second_col= driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
		System.out.println("Data of the second col of the second row is : " + second_row_second_col.getText());
		
		driver.close();
		
	}

}
