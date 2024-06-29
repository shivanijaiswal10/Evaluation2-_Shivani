package demo_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_drivenExcel {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
}

@Test
public void testcase1() throws IOException, InterruptedException {
	File excel = new File("C:/Users/shiva/OneDrive/Documents/ddfileusing.xlsx");
	FileInputStream fis = new FileInputStream(excel); // to read excel file
	XSSFWorkbook wb = new XSSFWorkbook(fis);  // to read the particuler workbook in an excel file
	XSSFSheet sht = wb.getSheet("Sheet1"); // to read from the sheet
	int rowcount = sht.getLastRowNum(); // fetch the data till the last row of the sheet
	
	for(int i = 0; i<= rowcount; i++)
	{
		String c1 = sht.getRow(i).getCell(0).getStringCellValue(); // for going inside column A
		 String c2 = sht.getRow(i).getCell(1).getStringCellValue();  // for going inside column B
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	        Thread.sleep(2000);
	}
	
}
}
