import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Babbu {
  @Test
  public static void sort() {
		int[] a = {1,18,9,2,6,1};
		int len = a.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len - i;j++) {
				if (a[j-1] < a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.println(a[i] + ",");
		}
		
		
		
	}
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
