package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
WebDriver driver= new FirefoxDriver();

@BeforeClass
public void open_brwoser() {
	driver.get("https://www.training-support.net/selenium/target-practice");
	}

@Test
public void testCase1() {
	 //This test case will pass
	String Title = driver.getTitle();
	System.out.println("Title of the page: " +Title);
	Assert.assertEquals(Title, "Target Practice");
}

@Test
  public void testCase2() { 
	//This test case will Fail
  WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
  Assert.assertTrue(blackButton.isDisplayed());
  Assert.assertEquals(blackButton.getText(), "black");
  }

@Test(enabled = false)
public void testCase3() {
    //This test will be skipped and not counted
    String subHeading = driver.findElement(By.className("sub")).getText();
    Assert.assertTrue(subHeading.contains("Practice"));
}

@Test
public void testCase4() {
    //This test will be skipped and will be be shown as skipped
    throw new SkipException("Skipping test case");      
}
    
@AfterClass
public void close_browser() {
	driver.close();
}
	
}
