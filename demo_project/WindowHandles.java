package demo_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	WebDriver driver;

	
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
}
	@Test
	public void Test1() {
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
//		to get all the handle the windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		//to get the id of parrent tab
		String parrentID=it.next();
		System.out.println(parrentID);
		//to get the id of child tab
		String childId=it.next();
		System.out.println(childId);
		driver.switchTo().window(childId);
		driver.findElement(By.linkText("Job Support")).click();
		driver.switchTo().window(parrentID);
		driver.findElement(By.xpath("(//*[@class=\"checkmark\"])[2]")).click();
		
		
		
	}
}
