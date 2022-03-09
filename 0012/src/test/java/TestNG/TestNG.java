package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@BeforeClass
	public void method1() {
		
		System.out.println("TEST1");
		
	}
	
	@BeforeMethod
	public void method2() {
	
		
		System.out.println("Test2");
	}
	
	@Test
	public void PQR() {
		System.out.println("Test3");

		
	}

	@Test
	public void ABC() {
		System.out.println("Test6");

		
	}
	
	
	@AfterMethod
	public void method4() {
		System.out.println("Test4");

		
	}
	
	@AfterClass 
	public void method5() {
		System.out.println("Test5");

		
	}

}
