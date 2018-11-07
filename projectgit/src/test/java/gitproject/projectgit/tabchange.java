package gitproject.projectgit;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tabchange {
	WebDriver driver = null;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentwindow = it.next();
		String childwiondow = it.next();
		driver.switchTo().window(childwiondow);
		driver.findElement(By.name("emailid")).sendKeys("raviprasadsingh92@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("child window url" +driver.getCurrentUrl());
		System.out.println("child window title is " +driver.getTitle());
		driver.switchTo().window(parentwindow);
		System.out.println("parent window title" +driver.getTitle());
		driver.close();
  }
  
  
}
