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

		System.out.print("How many divisors do you want to enter? ");

		int numDivisors = ProblemOne.getWholeNumberInput();

		LinkedList<Integer> divisors = new LinkedList<Integer>(); 

		for (int i = 1; i <= numDivisors; i++){

			System.out.print("Input a divisor. ");
			
			int divisor = ProblemOne.getWholeNumberInput();

			divisors.add(divisor);
		}

		System.out.print("What is the upper limit (non-inclusive) when "
					   + "checking for multiples? ");

		int upperLimit = ProblemOne.getWholeNumberInput();

		LinkedList<Integer> multiples = new LinkedList<Integer>(); 
		
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

	public static int getWholeNumberInput() {

		Scanner scanner = new Scanner(System.in);

		String placeholder = "";
		int toReturn = -1;

		while ((toReturn < 0) | (toReturn != (int) toReturn)){

			System.out.println("Please enter a positive whole number.");			  
			placeholder = scanner.nextLine();

			try {

				toReturn = Integer.parseInt(placeholder);
		
			}

			catch (NumberFormatException e) {
				System.out.print("Sorry, that wasn't a whole number. ");
			}
		}

		return toReturn;
	}
}