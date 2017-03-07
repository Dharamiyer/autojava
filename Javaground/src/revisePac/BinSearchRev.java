package revisePac;

public class BinSearchRev {

	public static void main(String[] args) {
		int [] arr = {3,6,9,12,15,18};
		int key = 2;
		int start = 0;
		int end = arr.length;
		if (key > arr[end-1] || key < arr[start]) {
			System.out.println("not a valid search");
					
		}
		else{
		while (end >= start) {
			int mid = (start + end)/2;
			if (key == arr[mid]) {
				System.out.println(key +" found ");
				break;
			}
			if (key > arr[mid]) {
				start = mid+1;
			}
			if(key < arr[mid]) {
				end = mid -1;
			}
			
		}
		System.out.println(key +" Not found ");
		}
	}

}
