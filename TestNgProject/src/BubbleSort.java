import java.util.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BubbleSort {
	@Test
	public static void sort(int[] arr) {
		int[] a = arr;
		int len = arr.length;
		int temp;
		for (int i = 0; i < i; i++) {
			for (int j = i+1; j < len - i;j++) {
				if (a[j] < a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.println(a[i] + ",");
		}
		
	}
		
	
	@AfterTest
	public static void test() {
		int arr[] = {9,6,1,4,2};
		BubbleSort.sort(arr);
	}
	

	
	
	

}
