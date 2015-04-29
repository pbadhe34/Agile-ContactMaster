package test.agile;

import static org.junit.Assert.*;
//import junit.framework.Assert.*;

import org.junit.Test;


public class FirstTest {
	
	@Test
	public void testRun()
	{
	 System.out.println("FirstTest.testRun()");
	 boolean flag = true;
	 assertEquals(true, flag);
	  
	 assertTrue(flag==false);
	}
	
	@Test
	public void Secondtest()
	{
	 System.out.println("Secondtest.testRun()");	 
	  
	 assertTrue(false);
	}
	
	

}
