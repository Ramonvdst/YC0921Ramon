package Miniopdachten;

//import java.util.Arrays;
import java.util.Random;

public class Mini4_ADVANCED {

	public static void main(String[] args) {
		Random rng = new Random();
		int myArray[] = new int[10];
		for(int i = 0; i< myArray.length; i++)
			{
				myArray[i] = rng.nextInt(1000);
			}
		//int myArray[] = {6,4,10,6,7,3};
		boolean swapped = true;
		int counter = 0;
		
		

		
		//BASIC
		//Arrays.sort(myArray);
		
		//ADVANCED
		System.out.println("Before: ");
		for(int i = 0; i< myArray.length; i++)
		{
			System.out.print(myArray[i] + ", ");
		}
		System.out.println("\n");
		
		while(swapped == true) 
		{
			
			for(int i = 0 ; i< myArray.length; i++) 
			{	
				if(i < myArray.length-1)
				{
					int num1 = myArray[i];
					int num2 = myArray[i+1];
					if(num1 > num2)
					{
						myArray[i] = num2;
						myArray[i+1] = num1;
						swapped = true;
						counter = 0;
					} 
					else 
					{
						counter++;
					}
				}
			}
			if(counter >= myArray.length)
			{
				swapped = false;
			}
			
		}
		
		
		
		
		
		System.out.println("After: ");
		for(int i = 0; i< myArray.length; i++)
		{
			System.out.print(myArray[i] + ", ");
		}
		
		
	}

}
