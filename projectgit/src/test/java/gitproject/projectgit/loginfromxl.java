package gitproject.projectgit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginfromxl {
	
	WebDriver driver = null;
	
  @Test
  public void f() throws IOException {
	   File src = new File("C:\\Users\\training_b6b.00.07\\Desktop\\login.xlsx");
	  FileInputStream FIS = new FileInputStream(src);
		 XSSFWorkbook wb = new XSSFWorkbook(FIS);
		 XSSFSheet sh = wb.getSheetAt(0);
		 System.out.println("cell data" +sh.getRow(0).getCell(0).getStringCellValue());
		 System.out.println("cell data" +sh.getRow(0).getCell(1).getStringCellValue());
		 int rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
		 for(int i=0;i<=rowcount;i++) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		 driver.findElement(By.name("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		 driver.findElement(By.name("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		 driver.close();
		 }
		 
	  
	  
  }
}
