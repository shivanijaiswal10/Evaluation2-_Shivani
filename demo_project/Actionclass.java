package demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {
	private static final WebElement SUPPORTlink = null;
	WebDriver driver;
	
//	in selenium we have 2 type of action - 1 keyboard action 2- mouse hover action
//	first we work on mouse hover action
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
//		 how to find title of any page 
		driver.getTitle();
	}
	
	@Test
	public void testcase1() {
		Actions act = new Actions(driver);
		System.out.println("i 'm in the ragistration page of guru99 mercury tours");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("shivani");
		driver.findElement(By.name("lastName")).sendKeys("Jaiswal");
		driver.findElement(By.name("phone")).sendKeys("9415693508");
		driver.findElement(By.id("userName")).sendKeys("shivi@0604gmail.com");
		driver.findElement(By.name("address1")).sendKeys("sultanpur,utterPradesh");
		driver.findElement(By.name("city")).sendKeys("Sultanpur"); 
		driver.findElement(By.name("state")).sendKeys("UtterPradesh");
		driver.findElement(By.name("postalCode")).sendKeys("93508");
		

		Actions act = new Actions(driver);
      WebElement supportlink = driver.findElement(By.linkText("SUPPORT"));
      
//		if we click right on mouse then we get context.
		act.contextClick(SUPPORTlink).build().perform();
	
//		We use Actions for derop_down
		
	WebElement drpdwn =	driver.findElement(By.name("country"));
    act.click(drpdwn).build().perform();
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();

	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
	act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//	
	
	Select se = new Select(drpdwn);
	
	se.selectByValue("CANADA");
		
		
		
		
		
		driver.findElement(By.name("country")).sendKeys("ALGERIA");
		driver.findElement(By.id("email")).sendKeys("shivi4");
		driver.findElement(By.name("password")).sendKeys("S9695643027");
		driver.findElement(By.name("confirmPassword")).sendKeys("S9695643027");
		driver.findElement(By.name("submit")).click();
	}
	

}
