import org.testng.annotations.Test;
import java.io.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class myFirstTest {
  @Test
  public void f() {
	  System.out.println("Executing Testa");
	  int num = 5;
		int fact = 1;
		for (int i = 1; i <= num ; i++ ) {
			 fact = fact * i;
			
		}
		System.out.println(fact);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Executing BeforeTesta");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executing AfterTesta");
  }

}
