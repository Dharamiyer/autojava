package revisePac;

public class BinSearch {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10, 12, 14,20,22,24};
		int start = 0;
		int len = arr.length -1;
		int end = len-1;
		int key = 4;
		Boolean flag = false;
		
		while (end >= start) {
			int mid = (start + end)/2;
			if (arr[mid] == key) {
				flag = true;
				System.out.println(flag);
				break;
			  }
			else if(key < arr[mid]) {
				end = mid -1;
				System.out.println(flag);
				}
			else if(key > arr[mid]) {
				start = mid + 1;
				System.out.println(flag);
				}
		}
		System.out.println(flag);
		
	}

}
