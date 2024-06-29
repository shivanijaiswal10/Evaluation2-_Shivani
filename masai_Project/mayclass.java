package masai_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mayclass {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ilaindia.co.in/registration");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void testcase1() {
	driver.findElement(By.id("jform_title")).click();
	driver.findElement(By.xpath("//option[@value='mrs']")).click();
	driver.findElement(By.id("jform_city_r")).click();
	driver.findElement(By.xpath("//option[@value ='Algeria'])")).click();
	}
	
	
	

}
