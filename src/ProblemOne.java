/**
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
* get 3, 5, 6 and 9. The sum of these multiples is 23.
*
* Find the sum of all the multiples of 3 or 5 below 1000.
* 
*/

import java.util.*;

public class ProblemOne extends Problem {
	
	public ProblemOne(){
		super("If we list all the natural numbers below 10 "
							+ "that are multiples of 3 or 5, we get 3, 5, "
							+ "6 and 9. The sum of these multiples is 23. "
							+ "Find the sum of all the multiples of 3 or "
							+ "5 below 1000.");
	}

	public void solver(){
		
		System.out.print("How many divisors do you want to enter? ");

		int numDivisors = Tools.getWholeNumberInput();

		LinkedList<Integer> divisors = new LinkedList<Integer>(); 

		for (int i = 1; i <= numDivisors; i++){

			System.out.print("Input a divisor. ");
			
			int divisor = Tools.getWholeNumberInput();

			divisors.add(divisor);
		}

		System.out.print("What is the upper limit (non-inclusive) when "
					   + "checking for multiples? ");

		int upperLimit = Tools.getWholeNumberInput();

		LinkedList<Integer> multiples = new LinkedList<Integer>(); 
		
		for (int x = upperLimit - 1; x>0; x--){
			
			int y;

			for (y=0; (y < divisors.size()) && (x % divisors.get(y) != 0); y++){

			}
			
			if (y != divisors.size()) {
				
				multiples.add(x); 
			}
		}		
		
		System.out.println("The sum is " + Tools.sumLinkedList(multiples) + ".");
		
	}

	//add find multiples method

	public void (LinkedList<Integer> divisors)

}