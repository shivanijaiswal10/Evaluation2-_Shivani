package demo_project;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCode {
	
	WebDriver driver;
	private int clickedCount;
	
	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
	}
	@Test (enabled = true)
	public void testcase() throws InterruptedException {
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		
		
		
		
		
		driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}
	
	@Test(enabled = false)
	public void testcase2() {
WebElement ckbox = driver.findElement(By.id("checkBoxOption1"));
		ckbox.click();
		if(ckbox.isSelected())
			System.out.println("The checkbox is selected");
		else
			System.out.println("checkbox is not selected");
		
	}
	
	@Test(enabled = false)
	public void tastecase3() {
//		i want to select multiple checkboex.
	List<WebElement>checkboxes =  driver.findElements(By.xpath("//*[@type='checkbox']"));
//	i will add the foreach loop
	for (WebElement checkbox : checkboxes) {
		checkbox.click();
		
	}
		
	}
	@Test
	public void tastecase4() {
		List<WebElement>checkboxes =  driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (WebElement checkbox : checkboxes)   {
		if (clickedCount < 2) {
			checkbox.click();
			clickedCount++;
			
		}else {
			break;
		}
		
	}
	
	}
}


