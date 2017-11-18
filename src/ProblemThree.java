/**
* The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
* factor of the number 600 851 475 143 ?
*/

import java.util.*;

public class ProblemThree extends Problem {
	
	String prompt = "The prime factors of 13195 are 5, 7, 13 and 29. What is"
					+ " the largest prime factor of the number 600851475143?";
																9223372036854775807

	public void printPrompt(){
		System.out.println("Here is the prompt:");
		System.out.println(prompt);	
	}

	public void startSolver(boolean displayPrompt){

		if (displayPrompt) {
			printPrompt();
		}

		System.out.println("Let's get started.");
		Tools.largestPrime(Tools.getLongWholeNumberInput());

	}
}




