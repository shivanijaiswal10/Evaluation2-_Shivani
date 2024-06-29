package demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_evl {
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	
public void tastcase1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()= ' Login']")).click();
		//navigate to admin - user Management- Users
		
		driver.findElement(By.xpath("//span[.='Admin']")).click(); // admin tab click
		
		driver.findElement(By.xpath(".oxd-input oxd-input--active")).click();// User Management click
		driver.findElement(By.className("oxd-select-text-input")).click(); //Users click
		
		
		
	}
	
	
	@Test
	
	public void SelectEmp() throws InterruptedException {
		Thread.sleep(3000);
		//Select 'Jackali Adien' from the employee name dropdown  
        WebElement SelectEmp = driver.findElement(By.id("Type for hints...")).click(); // dropdown click
        WebElement SelectEmp = driver.findElement(By.name("Jackali Adien")).click();
		
		
	}
	@Test
	public void logoutTest() {
		// Logout the application
WebDriverWait wait = driver.findElement(By.className("oxd-userdropdown-img")).click();
WebElement logoutButton =  driver.findElement(By.className("oxd-userdropdown-link")).click();
		
	}
	@AfterTest
	public void teardown() {
		if(driver != null) {
			driver.quit();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
}
