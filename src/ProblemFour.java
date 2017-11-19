/**
* A palindromic number reads the same both ways. The largest palindrome made
* from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
* palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;

public class ProblemFour extends Problem{

	String prompt = "A palindromic number reads the same both ways. The"
					+ " largest palindrome made from the product of two"
					+ " 2-digit numbers is 9009 = 91 × 99. Find the largest"
					+ " palindrome made from the product of two 3-digit"
					+ " numbers.";

	public void printPrompt(){
		System.out.println("Here is the prompt:");
		System.out.println(prompt);	
	}

	public void startSolver(boolean displayPrompt){

		if (displayPrompt) {
			printPrompt();
		}

		System.out.println("Let's get started.");
		System.out.println("Here is what we are doing...");


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


}