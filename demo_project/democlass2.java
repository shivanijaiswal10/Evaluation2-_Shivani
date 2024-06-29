package demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class democlass2 {
	
	WebDriver driver;
	
	@BeforeTest
	 public void bt () {
		//its use to opening browser and navigate the URL
		// the codes that i will write in my before test will run after every test method 
		// present inside my class 
		// i will open the orangehrm
//		System.out.println("open orangehrm for me");
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginpage() {
//		// the script that you want to write, we can inside the test method and my class can have multiple test method
//		
		System.out.println("login page is opened");
//		
	}
	@Test
	public void homepage() {
		System.out.println("homepage is opened");
	
	}

	@AfterTest
	public void at () {
//		//in after test you can close your browser
		System.out.println("browser closed");
//		
	}
//	
//	
//
}
