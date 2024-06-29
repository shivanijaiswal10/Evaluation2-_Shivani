package demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
	WebDriver driver;
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		dr2.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Indi");
		Thread.sleep(2000);
		dr2.findElement(By.xpath("//div[@class=\"ui-menu-item-wrapper\" and .='India']")).click();

}
