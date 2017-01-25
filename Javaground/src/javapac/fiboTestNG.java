package javapac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class fiboTestNG {
  @Test
  public void f() {
	  int a = 0;
	  int b = 0;
	  int c = 1;
	  for (int i = 0; i< 5; i++){
		  a = b;
		  b = c;
		  c = a + b;
		  System.out.println(c);
		  
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@aftermeth");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Beforecls");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@aftrcls");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@beftst");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@afttst");
  }

}
