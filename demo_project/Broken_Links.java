package demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {

private static final WebElement[] Atags = null;
WebDriver driver;

	
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
}
	@Test
	public void Test1() {
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		
//		https://demo.guru99.com/test/newtours/support.php
		  driver.findElement(By.tagName("a"));
		  for(WebElement lk : Atags )
		  {
			  System.out.println(lk.getAttribute("href"));
		  }
		 System.out.println(Atags.size());
		  }
	@AfterTest
	public void aftertest() {
	driver.quit();
	}
}


