package javapac;

public class bubblesort {

	public static void main(String[] args) {
		int[] numbers = { 1,4,6,9 };
		int arrlen= numbers.length;
		int tempVar;
		for (int i = 0; i < arrlen; i++)
		{
			for(int j = 1; j < arrlen - i; j++)
			{
				if(numbers[j-1] < numbers[j])
				{
					tempVar = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = tempVar;
				}
			}

		}
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}

		

	}

}
