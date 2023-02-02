package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("How much money are you starting with?");
		double startAmount = in.nextDouble();
		System.out.print ("What is your probability of winning?");
		double winChance = in.nextDouble();
		System.out.print("How much money will you be happy with?");
		double winLimit = in.nextDouble();
		System.out.println("How many days are you going to gamble?"); 
		int totalSimulations = in.nextInt(); 
		double expectedRuin = 0.0;
		 
	
		for(int i =0;  totalSimulations>i; i++) {
		
		while (startAmount>0 && winLimit >= startAmount){
			double random = Math.random(); 
			if (winChance > random)
			{
				System.out.println("Success");
				System.out.println( "You now have " + startAmount); 
				startAmount = startAmount+1;
				
			
			}
			
			else {
		System.out.println("ruin");
			startAmount = startAmount-1;
			System.out.println( "You now have " + startAmount +"Get out of here!" );
		

				
				
			}
}
	
	if (winChance == .5)
	{ 
		expectedRuin = 1 - (startAmount/winLimit);
		
	}
	else 
	{
		double a = (1 - winChance)/winChance; 
	expectedRuin = ( pow(a, startAmount)-  pow(a, winLimit))/ (1- pow(a, winLimit));
			; 
		
	}
	
		
		}	
		
			
				
								}

	private static int pow(double a, double winLimit) {
		// TODO Auto-generated method stub
		return 0;
	}
			
				
		
	}

	
		
	


