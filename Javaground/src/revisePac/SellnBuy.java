package revisePac;

import java.util.Arrays;

public class SellnBuy {

	public static void main(String[] args) {
		int [] sellbuy = {2,5,11,1,10};
		int maxsell = 0 ;
		int minbuy = 100;
		int maxpro = 0;
		int maxindex = 0;
		int minindex = 0;
//		
//		for (int i = 0 ; i < 5; i++) {
//			if (sellbuy[i]>maxsell) {
//				maxsell = sellbuy[i];
//				maxindex = i;
//			}
//			if (sellbuy[i] <= minbuy) {
//				minbuy = sellbuy[i];
//				minindex = i;
//			}
//			
//		}
//		System.out.println( minbuy +"["+ minindex+"] ," +maxsell+"["+ maxindex+"]" );
//	
		
		for (int i =0,j=1; j <=4; i++,j++) {
			int temp = sellbuy[j]-sellbuy[i];
		if (temp> maxpro)	{
			maxpro = temp;
		}
			
		}
		System.out.println("Maxpro = "+ maxpro);

	}

}
