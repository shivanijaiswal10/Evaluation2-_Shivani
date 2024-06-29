package demo_project;

import org.testng.annotations.Test;

public class Anotation_class {
	
	@Test (dependsOnMethods = {"method2"})
	
	public void method1() {
		System.out.println("Hello,This is my first test");
			
	}

	
	@Test
	 public void method2() {
		System.out.println("Hello,This is my second test");
		
	}

}
