package Miniopdachten;

public class Mini3 {

	public static void main(String[] args) {
		
		int array[] = {100,2,3,4,5,6,7,8,9};
		int total = 0;
		for(int i =0 ; i < array.length; i++)
		{
			total = array[i] + total;
		}
		
		System.out.println("the total of array = " + total);
		
	}

}
