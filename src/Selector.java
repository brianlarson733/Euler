/**
* Object for choosing which option to activate.
*/

import java.util.*;

public class Selector {

	public void startSelector(){

		//ProblemOne problemOne = new ProblemOne();
		//ProblemTwo problemTwo = new ProblemTwo();
		Problem[] problems = new Problem[]{new ProblemOne(), new ProblemTwo()};
		
		int[] choices = new int[problems.length];
		for (int i = 0; i < choices.length; i++){
			choices[i]=i+1;
		}
		
		boolean running = true;
		

		System.out.println("I have " + problems.length + " problems you can"
							+ " select from. Here are your options to" 
							+ " proceed:");
		
		System.out.println("1) Review the prompt for a problem");
		System.out.println("2) Start the solver for a problem");
		System.out.println("3) Exit this program");
		
		while(running){
			int[] tempArray = {1, 2, 3};
			int choice = Tools.getWholeNumberInput(tempArray);

			switch (choice){
				case 1:
					System.out.print("Okay, which problem's prompt do you want"
										+ " to see? ");
					problems[Tools.getWholeNumberInput(choices)].printPrompt();
					break;
			
				case 2:
					System.out.println("Sure, which problem do you want to"
									 + "solve?");
					int temp = Tools.getWholeNumberInput(choices);
					System.out.print("Would you like to see the prompt for"
										+ "this problem? ");
					problems[temp].startSolver(Tools.getBooleanInput());
					
				case 3:
					System.out.println("Adios!");
					running = false;
					break;
				
				default:
					break;
			}	
		}
	}
}