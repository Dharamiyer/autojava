package javapac;
//This Does NOT work
public class mergesortdarrStackoverflowsolution {

	public static void main(String[] args) {
		int[] a = {9,3,1,8,6,2};
		int[] b = {1,3,9,6,2,8};
		mergesortdarrStackoverflowsolution obj = new mergesortdarrStackoverflowsolution();
		int[] c = obj.merge(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		

	}
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)  
	       answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}

}
