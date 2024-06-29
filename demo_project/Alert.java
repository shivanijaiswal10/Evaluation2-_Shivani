package demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
WebDriver driver;
	

	@BeforeTest
	public void bforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
}
}