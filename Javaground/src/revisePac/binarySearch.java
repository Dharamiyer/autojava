package revisePac;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		int [] arr = {1,3,9,18};
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter search digit :");
		int inp = Scan.nextInt();
		Scan.close();
		Boolean bool = binarySearch.search(arr,inp);
		System.out.println(bool);

	}
	public static boolean search(int[] arr, int key) {

		int len = arr.length -1;
		int low = 0;
		int high = len - 1;

		while(high >= low) {
			int middle = (low + high) / 2;
			if(arr[middle] == key) {
				return true;
			}
			if(arr[middle] < key) {
				low = middle + 1;
			}
			if(arr[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}

}
