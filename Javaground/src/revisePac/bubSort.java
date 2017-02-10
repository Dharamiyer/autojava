package revisePac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class bubSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int a = 0;
		System.out.println("Input five numbers");
		for (int i = 0; i < 5; i++) {
			int x = scan.nextInt();
			arr[i] = x;
		}
		scan.close();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);

		}
		int temp = -1;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len - i); j++) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}

		}
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			if (lhm.get(arr[i]) != null) {
				lhm.put(arr[i], lhm.get(arr[i]) + 1);
			} else {
				lhm.put(arr[i], 1);
			}

		}
		for (Entry<Integer,Integer> ent: lhm.entrySet()) {
			System.out.println(ent.getKey() + " is repeated "+ ent.getValue() + " Times");
		}

	}

}
