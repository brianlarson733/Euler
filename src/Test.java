/**
* Used as a tester class for my Euler project.
*/

import java.util.*;

public class Test {

	public static void main(String[] args){

		System.out.println("How many digits do you want each factor to be?");
		int digits = Tools.getWholeNumberInput();

		System.out.println("How many factors do you want to multiply together?");
		int numFactors = Tools.getWholeNumberInput();

		int answer = 0;
		int factorOne = (int)Math.pow(10,digits)-1;

		answer = ProblemFour.multiplyFactors(factorOne, numFactors-1, digits);
		System.out.println(answer);
	}
}