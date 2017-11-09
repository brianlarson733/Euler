/**
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
* get 3, 5, 6 and 9. The sum of these multiples is 23.
*
* Find the sum of all the multiples of 3 or 5 below 1000.
* 
* To improve - use try/catch for possible string input of numbers, refactor to have methods of 
* reusable code.
*/

import java.util.*;

public class ProblemOne {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many numbers do you want to enter? Enter a positive " 
						 + "whole number (e.g., 1, 5, 100, etc.).");

		int numDivisors = Integer.parseInt(scanner.next());

		while ((numDivisors < 0) | (numDivisors != (int) numDivisors)){
			System.out.println("Sorry, that wasn't a positive whole number. "
						   + "Please enter a positive whole number "
						   + "(such as 4, 7, 15, etc.) to signify how many divisors "
						   + "I should save.");
			numDivisors = Integer.parseInt(scanner.next());
		}

		LinkedList<Integer> divisors = new LinkedList<Integer>(); // this list will hold the
														  // divisors

		for (int i = 1; i <= numDivisors; i++){

			System.out.println("Please input a positive whole number as the divisor and "
						   + "press the Enter/Return key.");
			
			int divisor = Integer.parseInt(scanner.next());
			
			while ((divisor < 0) | (divisor != (int) divisor)){
				System.out.println("Sorry, that wasn't a positive whole number. "
							   + "Please enter a positive whole number "
							   + "(such as 4, 7, 15, etc.) as the divisor.");
							   
				divisor = Integer.parseInt(scanner.next());
			}

			divisors.add(divisor);
		}

		System.out.println("What positive number is the upper limit (non-inclusive) when "
					   + "checking for multiples?");

		int upperLimit = Integer.parseInt(scanner.next()); 

		while ((upperLimit < 0) | (upperLimit != (int) upperLimit)){
			System.out.println("Sorry, that wasn't a positive whole number. "
						   + "Please enter a positive whole number "
						   + "(such as 4, 7, 15, etc.) as the divisor.");
						   
			upperLimit = Integer.parseInt(scanner.next());
		}

		LinkedList<Integer> multiples = new LinkedList<Integer>(); // this list will hold the 
														   // confirmed multiples.	
		

		for (int x = upperLimit - 1; x>0; x--){		
			
			int y;

			for (y=0; (y < divisors.size()) && (x % divisors.get(y) != 0); y++){

			}
			
			if (y != divisors.size()) {
				
				multiples.add(x); 
			}
		}		
		
		int sum = 0;

		while (multiples.size() > 0){
			
			sum += multiples.poll();

		}
		System.out.print("The sum is " + sum + ".");
		
	}	
}