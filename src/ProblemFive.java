// reminder: pseudo code, test code, real code

/**
* 2520 is the smallest number that can be divided by each of the numbers from
* 1 to 10 without any remainder. What is the smallest positive number that is
* evenly divisible by all of the numbers from 1 to 20?
*/

import java.util.*

public class ProblemFive extends Problem{

	public ProblemFive(){
		super("2520 is the smallest number that can be divided by each of the "
			+ "numbers from 1 to 10 without any remainder. What is the "
			+ "smallest positive number that is evenly divisible by all of "
			+ "the numbers from 1 to 20?";)

	}

	public void solver(){
		System.out.println("What is the smallest number in the range to be "
						 + "considered?");
		int start = Tools.getWholeNumberInput();

		System.out.println("What is the largest number in the range to be "
						 + "considered?");
		int end = Tools.getWholeNumberInput();

		// create array list of numbers for the range

		// since LCM is associative you can calculate getLCM for every two
		// members of the array, popping them as you go and adding the answer
		// to the end. The recursion ends when arrayList only contains one 
		// member.

		// Print the single member of arrayList as the answer.
	}

	public int getLCM(int a, int b){
		int toReturn = 1;
		toReturn = Math.abs(a*b)/getGCD(a,b);
		return toReturn;
	}

	public int getGCD(int a, int b){
		int toReturn = 1;

		// insert Euclidean algorithm code
		
		return toReturn;
	}
}