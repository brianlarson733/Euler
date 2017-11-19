/**
* Used as a tester class for my Euler project.
*/

import java.util.*;

public class Test {
	public static void main(String[] args){

		//long number = Tools.getLongWholeNumberInput();
		/*
		for(int i = 1; i < 100; i++){
			System.out.println("i is " + i);
			System.out.println(Tools.largestPrimeFactor(i));
			System.out.println();
		}
		*/
		long toPrint = Tools.largestPrimeFactor(47055833458L);
		System.out.println(toPrint);
	}
}