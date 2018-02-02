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

		System.out.println("Here is what we are doing...");
		//how many factors do you want? 
		//how many digits for each factor? 
		//based on number of digits create upper limit (exponential notation is helpful)
		//based on numFactors do you do recursion? 

		//a*b, check isPalindrome, decrement b, once b is floored decrement a and make b under a

		//for loop counting backwards
		/*
		* Goal: find largest palindrome from multiplying a set of numbers together
		* Gather requirements:
		*	how many numbers to multiply together
		*	should all the factors have the same number of digits? 


		System.out.println("Enter how many numbers you would like to multiply"
							+ " together.");
		int numNumbers = Tools.getWholeNumberInput();

		System.out.println("How many digits do you want the palindrome to"
							+ " have?");
		int numDigits = Tools.getWholeNumberInput();
		int toPrint = 0;

		//find largest palindrome product of two 3-digit numbers
		//variables - how many numbers, how many digits
		//end goal - find palindrome
		System.out.println("The largest palindrome with " + numDigits + " digits"
							+ " after multiplying " + numNumbers + " numbers"
							+ " is" + toPrint);
	}
	*/
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