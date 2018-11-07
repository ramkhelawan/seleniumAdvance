package gitproject.projectgit;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test11cookies {
	
	WebDriver driver = null;
	
  @Test
  
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Set <Cookie> cook = driver.manage().getCookies();
		Iterator<Cookie> it= cook.iterator();
		while(it.hasNext())
		{
			System.out.println("all the cookies in google" +it.next());
			
		}
		
		driver.manage().deleteAllCookies();
		
  }
}
