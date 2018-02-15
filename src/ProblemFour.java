/**
* A palindromic number reads the same both ways. The largest palindrome made
* from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
* palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;

public class ProblemFour extends Problem{

	public ProblemFour(){
		super("A palindromic number reads the same both ways. The"
					+ " largest palindrome made from the product of two"
					+ " 2-digit numbers is 9009 = 91 × 99. Find the largest"
					+ " palindrome made from the product of two 3-digit"
					+ " numbers.");
	}

	public void solver(){

		System.out.println("How many digits do you want each factor to be?");
		int digits = Tools.getWholeNumberInput();

		System.out.println("How many factors do you want to multiply together?");
		int numFactors = Tools.getWholeNumberInput();
		
		int answer = 0;
		int factorOne = (int)Math.pow(10,digits)-1;

		//a*b, check isPalindrome, decrement b, once b is floored decrement a and make b under a

		answer = multiplyFactors(factorOne, numFactors-1, digits);

		if (isPalindrome(answer)){
			System.out.println("The largest palindrome that is the product of " +
								numFactors + " " + digits + "-digit numbers is " +
							   answer);
		}
		else
			System.out.println("There is no palindrome that is the product of " +
								numFactors + " " + digits + "-digit numbers.");
	}

	public static int multiplyFactors(int factorOne, int numFactors, int digits){
		int toReturn = factorOne;
		
		if(numFactors==0){
			System.out.println("recursive base case");
			System.out.println("base toReturn is " + toReturn);
			return toReturn;
		}
		
		for(int factorTwo = factorOne; factorTwo > (Math.pow(10,digits-1) -1);factorTwo--){
			
			System.out.println("factorOne is " + factorOne);
			
			toReturn = factorOne * multiplyFactors(factorTwo, numFactors-1, 
													digits);
			System.out.println("loop toReturn is " + toReturn);
			
			if(ProblemFour.isPalindrome(toReturn)){
				System.out.println("isPalindrome check");
				break;
			}
		}
		return toReturn;
	}

	public static boolean isPalindrome(int number){
		
		String toCheck = Integer.toString(number);
		boolean toReturn = true;
		int i = 0;
		int j = toCheck.length()-1;
		
		while(toReturn & (i<j)){
			if(toCheck.charAt(i) != toCheck.charAt(j)){
				toReturn = false;
			}
			else {
				i++;
				j--;
			}
		}
		return toReturn;
	}


}