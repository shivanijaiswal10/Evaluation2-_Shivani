package demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// data provider is a testing annotation- used to automate the process of providing test cases for execution 
//We can run the same method that can be run multiple times with different data sets.

public class dataDrivenTesting {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	
	
}
	@Test (dataProvider =  "dp")
	public void testcase() throws InterruptedException {
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
	}
	@DataProvider
	public Object[][] dp()
	{
		return new Object[][]
				{
			 new Object[] {"Admin", "admin123"}
			
				};
	}
}

        
        