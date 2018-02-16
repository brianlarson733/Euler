/**
* Object for choosing which option to activate.
*/

import java.util.*;

public class Selector {

	public void startSelector(){

		Problem[] problems = new Problem[]{new ProblemOne(), new ProblemTwo(), new ProblemThree(), new ProblemFour()};
		
		int[] choices = new int[problems.length];
		for (int i = 0; i < choices.length; i++){
			choices[i]=i+1;
		}
		
		boolean running = true;
				
		while(running){
			System.out.println("I have " + problems.length + " problems you can"
								+ " select from. Here are your options to" 
								+ " proceed:");
			System.out.println("1 - Review the prompt for a problem");
			System.out.println("2 - Start the solver for a problem");
			System.out.println("3 - Exit this program");
			int[] tempArray = {1, 2, 3};
			int choice = Tools.getWholeNumberInput(tempArray);

			switch (choice){
				case 1:
					System.out.print("Okay, which problem's prompt do you want"
										+ " to see? ");
					problems[Tools.getWholeNumberInput(choices)-1].printPrompt();
					break;
			
				case 2:
					System.out.println("Sure, which problem do you want to"
									 + " solve?");
					int temp = Tools.getWholeNumberInput(choices) -1;
					System.out.print("Would you like to see the prompt for"
										+ " this problem? ");
					problems[temp].startSolver(Tools.getBooleanInput());
					break;
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