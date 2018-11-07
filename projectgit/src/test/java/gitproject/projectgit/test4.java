package gitproject.projectgit;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 { 


	
	WebDriver driver = null;
	
	@Test
	
	public void fetn() throws IOException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	driver.findElement(By.name("btnK")).click();
	System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().startsWith("Selenium"));
	
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	FileUtils.copyFile(srcFile,new File("C:\\Users\\training_b6b.00.07\\Desktop\\test\\txt.png"));
	
	driver.close();
	
	}
	}
	

