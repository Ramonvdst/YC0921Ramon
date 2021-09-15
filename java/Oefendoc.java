package ramonproject;

import java.util.Scanner;

public class Oefendoc 
{

	public static void main(String[] args) 
	{
		
		//IF ELSE-------------------------------------------------------------------------------------------------------------------------
//		int player_score = 0;
//		int score_goal = 1000;
//		
//		player_score = 800;
//		
//		if( player_score == score_goal ) 
//		{
//			System.out.println("You matched the goal exactly! You get a super-awesome-bonus!!");
//			player_score = 0;
//		} 
//		else if( player_score < score_goal )
//		{
//			System.out.println("You lost! You are a shame to humanity!");
//		}
//		else
//		{
//			System.out.println("You won, Yay!");
//			player_score = 0;
//		}
		
		//BOOLEANS-------------------------------------------------------------------------------------------------------------------------
//		boolean my_boolean = true;
//		
//		if(my_boolean == false)
//		{
//			System.out.println("my_boolean is false!");
//		}
//		
//		int a = 5;
//		int b = 10;
//		
//		if( a < b)
//		{
//			System.out.println("a is NOT smaller than b!");
//		}
		
		//IF ELSE + BOOL-------------------------------------------------------------------------------------------------------------------------
//		int player_score = 0;
//		int score_goal = 1000;
//		
//		boolean has_key = true;
//		player_score = 5000;
//		
//		
//		if (player_score >= score_goal && has_key)
//		{
//			System.out.println("You won AND unlocked a super-cool secret!");
//		}
//		else if (player_score >= score_goal) 
//		{
//			System.out.println("You won!");
//		}
		//WHILE LOOP --------------------------------------------------------------------------------------------------------------------------------
		
//		int number1 = 5, number2 = 10;
//		
//		while(number1 < number2)
//		{
//			System.out.println(number1);
//			number1++;
//		}
		
		//FOR LOOP --------------------------------------------------------------------------------------------------------------------------------------
		
		//initialization of a for-loop
		//termination of for-loop
		//increment
//		for (int i = 0; i < 10; ++i)
//		{
//			System.out.println("Value of i: " + i);
//			
//			if(i == 7)
//			{
//				System.out.println("Break @: " + i);
//				break;
//			}
//		}
		
		//Arrays------------------------------------------------------------------------------------------------------------------------------------------------
//		int[] my_array = new int[100];
//		int my_array2[] = new int[100];
//		//new allocates memory in a specific way to hold info
//
//		int my_array3[];			//declare array
//		my_array2 = new int [5];	//initialize array
//		
//		//initializer list
//		int my_array4[];
//		my_array4 = new int[] {10, 14, 16, 18, 20};
//		
//		System.out.println(my_array4[1]);
//		
//		int[] another_array = new int[3];
//		another_array[0] = 50;
//		another_array[1] = 75;
//		another_array[2] = 100;
//		
//		
//		int sum = another_array[0] + another_array[1];
//		System.out.println(sum);
//		
//		int[] big_array = new int[1000];
//		
//		for(int i = 0; i < big_array.length; ++i)
//		{
//			big_array[i] = i+50;
//			System.out.println(big_array[i]);
//		}
		
		//USER INPUT WITH SCANNER --------------------------------------------------------------------------------------------------------------------------------------
		
//		String name;
//		int age;
//		
//		//Scanner is a clas
//		//Als je de Scanner class wilt gebruiken moet je die eerst importeren
//		//Daarna specifieren van de datatype en naam: 'Scanner my_scanner'
//		//Assign een value hieraan met de 'new' operator, de new operator allocate memory op een specifieke manier
//		//Callen van de 'Constructor' van de class, wat dezelfde naam heeft als de class zelf: 'Scanner'
//		//en gebruikt parameter 'System.in' on een input van de user te lezen
//		// variabelen van een class is een instance: 'my_scanner' in dit gevanls
//		Scanner my_scanner = new Scanner(System.in);
//		
//		System.out.println("Please enter your name: ");
//		name = my_scanner.nextLine();
//		System.out.println("Please enter your age: ");
//		age = my_scanner.nextInt();	
//		
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
		
		//CALCULATOR------------------------------------------------------------------------------------------------------------------------------------------------------
		
		double number1, number2;
		double result = 0;
		char operator;
		
		
		Scanner input = new Scanner(System.in);
		
		
//Fill first number
		System.out.print("Enter your first number: ");
		
		while(input.hasNextDouble() == false)
		{
			System.out.println("Invalid input! only numbers are allowed.");
			input.nextLine();
		}
		
		number1 = input.nextDouble();
		
		
		
//Fill operator
		//String user_input = input.next();
		//operator = user_input.charAt(0);
		System.out.print("Enter your operator: ");
		do
		{
			operator = input.next().charAt(0);
		}
		while(operator != '+' && operator != '-' && operator != '*' && operator != '/');
		
		//operator = input.next().charAt(0);
		
		
//Fill second number
		System.out.print("Enter your second number: ");
		
		while(input.hasNextDouble() == false)
		{
			System.out.println("Invalid input! only numbers are allowed.");
			input.nextLine();
		}
		
		number2 = input.nextDouble();
		
		switch(operator)
		{
		case '+': result = number1 + number2; break;
		case '-': result = number1 - number2; break;
		case '*': result = number1 * number2; break;
		case '/': result = number1 / number2; break;
		}
		
		
		System.out.println("----------------");
		System.out.println("" + number1 + operator + number2 + " = " + result);
		
		
		
		
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
