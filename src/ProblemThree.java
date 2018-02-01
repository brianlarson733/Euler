/**
* The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
* factor of the number 600 851 475 143 ?
*/

import java.util.*;

public class ProblemThree extends Problem {
	
	public ProblemThree(){
		super("The prime factors of 13195 are 5, 7, 13 and 29. What is"
					+ " the largest prime factor of the number 600851475143?");
	}

	public void solver(){

		System.out.println("Which number would you like me to find the largest"
							+ " prime factor for?");
		System.out.println("The largest prime factor is " + 
			largestPrimeFactor(Tools.getLongWholeNumberInput()));
	}

	public long largestPrimeFactor(long number){
		long toReturn = number;

		if ((number % 2 == 0) & (number != 2)){
			toReturn = largestPrimeFactor(number/2);
			return toReturn;
		}
		if ((number % 3 == 0) & (number != 3)){
			toReturn = largestPrimeFactor(number/3);
			return toReturn;
		}

		Long num = new Long(number);
		double squareRoot = Math.floor(Math.sqrt(num.doubleValue()));

		for(int i=0; (6*i+5)<=squareRoot; i++){
			if(number%(6*i+5)==0){
				toReturn = largestPrimeFactor(number/(6*i+5));
				return toReturn;
			}
			if(number%(6*i+7)==0){
				toReturn = largestPrimeFactor(number/(6*i+7));
				return toReturn;
			}
		}
		return toReturn;
	}


}




