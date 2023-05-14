package TestNG;

import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test; 

public class TestNG2 {
	

		 @BeforeClass
		 public void beforeClass()
		 { 
		   System.out.println("Before class"); 
		 } 
		 @BeforeMethod
		 public void beforeMethod()
		 { 
		   System.out.println("Before method"); 
		  } 
		 @Test
		 public void test1()
		 { 
		   System.out.println("Test1 is executed"); 
		 } 
		 @Test
		 public void test2()
		 { 
		    System.out.println("Test2 is executed"); 
		 } 
		 @AfterMethod
		 public void afterMethod()
		 { 
		    System.out.println("After method"); 
		 } 
		 @AfterClass
		 public void afterClass()
		 { 
		    System.out.println("After class"); 
		  } 
		 }