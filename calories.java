// Dhundi Acharya

import java.util.Scanner;

public class calories 
{
    
	private static Scanner input;

	public static void  main(String []args)
	{
		
		int [] foodCalories = {357,185,388 };
		
		input = new Scanner(System.in);
		
		System.out.print("Number of Burritos consumed: ");
		
		int numOfBurrito = input.nextInt();
		
		double numOfMilesBurrito = (double)(numOfBurrito * foodCalories[0])/100;
	
		
		System.out.println("Miles you would have to run or walk to burn off the burritos: " + numOfMilesBurrito);
	
		System.out.println();	
        System.out.print("Number of salads consumed: ");
		
		int numOfSalads = input.nextInt();
		
		double numOfMilesSalads = (double)(numOfSalads * foodCalories[1])/100;
		
		System.out.println("Miles you would have to run or walk to burn off the salads: " + numOfMilesSalads);
		
		System.out.println();	
        System.out.print("Number of salads consumed: ");
		
		int numOfShakes = input.nextInt();
		
		double numOfMilesShakes = (double)(numOfShakes * foodCalories[2])/100;
		
		System.out.println("Miles you would have to run or walk to burn off the milk shakes: " + numOfMilesShakes);
			
	} // main
} //class
