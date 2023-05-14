package TestNG;

import org.testng.annotations.Test; 

public class TestNGPriority {
	
		@Test(groups = {"Largest Asian Country"}, priority = 2) 
		public void India() 
		{ 
		   System.out.println("India: Delhi"); 
		} 
		@Test(groups = {"Largest Asian Country"}, priority = 1) 
		public void china() 
		{ 
		   System.out.println("China: Beijing"); 
		} 
		@Test(groups = {"Largest Asian Country"}, priority = 3) 
		public void Nepal() 
		{ 
		  System.out.println("Nepal: Kathmandu"); 
		 } 
		@Test(groups = {"Largest Asian Country"}, priority = 0) 
		public void Russia() 
		{ 
		   System.out.println("Russia: Moscow"); 
		 } 
		}