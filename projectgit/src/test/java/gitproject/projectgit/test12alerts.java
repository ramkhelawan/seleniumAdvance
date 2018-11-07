package gitproject.projectgit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test12alerts {
	
	WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println("terms and condition of the pop up" +alt.getText());
		alt.accept();//to click on OK
		Alert alt1 = driver.switchTo().alert();
		System.out.println("terms and condition of the pop up" +alt1.getText());
		alt1.accept();
		Thread.sleep(3000);
		driver.close();
		
  }
}
