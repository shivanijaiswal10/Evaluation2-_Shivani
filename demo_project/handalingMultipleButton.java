package demo_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handalingMultipleButton {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

}
//	How to handle Redio Button
	@Test
	public void tasecase1() {
	List <WebElement> li	= driver.findElements(By.name("radioButton"));
	
	for()
		
	}
	li.get(i).click();
	Thread.sleep(1000);
	}
}
}


