package demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmPaths {
	

}
	@Test
	public void Test() {
		driver.findElement(By.name("username")).sendKeys("Ramayan"); //*[@id="app"]/div[1]/div/div[1]/div/div[2]/di
		driver.findElement(By.name("password")).sendKeys("12345");
	}
}
