/**
* Used as a tester class for my Euler project.
*/

import java.util.*;

public class Test {

	public static void main(String[] args){

		// 1 factor
		int digits = 3;
		int a = (int)Math.pow(10, digits) - 1; // a is 999
		System.out.println(ProblemFour.isPalindrome(a)+" " + a);

		//2 factors
		int numFactors = 2;
		int digits = 3;

		
		int toCheck = genFactor(digits, 1);
		int counter = toCheck - 1;
		for(int i = numFactors; i > 0; i--){
			toCheck = genFactor(digits, toCheck-1);
		}

		System.out.println(ProblemFour.isPalindrome(a)+" " + a);

	}

	public int genFactor(int numDigits, int input){
		int a = (int)Math.pow(10, numDigits) - 1; // a is 999
		return a * input;
	}
}