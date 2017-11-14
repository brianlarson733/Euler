/**
* Object for choosing which option to activate.
*/

import java.util.*;

public class Selector {

	public void startSelector(){

		//ProblemOne problemOne = new ProblemOne();
		//ProblemTwo problemTwo = new ProblemTwo();
		Object[] problems = new Object[]{new problemOne(), new problemTwo()};
		Scanner scan = new Scanner(System.in);
		System.out.println("I have " + problems.size + "problems you can"
							+ " select. Here are your options to proceed:");
		boolean running = true;
		boolean seePrompt = false;
		
		System.out.println("1) Review the prompt for a particular problem.");
		System.out.println("2) Start the solver for a problem.");
		System.out.println("3) Exit this launcher program.");
		System.out.println("Which would you like? (1, 2, 3)");
		try{
			int choice = scan.nextline();	
		}
		catch (NumberFormatException e) {
			System.out.print("Sorry, that wasn't a valid option. Enter 1,"
							+ " 2, or 3");
		}
		switch (choice){
			case 1:
				//askInput on problem number
				//displayPrompt for problem number
			case 2:
				//askInput on problem number
				//askInput on see prompt
				//displayPrompt
				//startSolver
			case 3:
				//kill switch
			default:
				//notValidInput

		}

//get input
//say not a valid option
//see prompt
//start solver


		(while running){
			System.out.println("1) Review the prompt for a particular problem.");
			System.out.println("2) Start the solver for a problem.");
			System.out.println("3) Exit this launcher program.");
			System.out.println("Which would you like? (1, 2, 3)");
			try{
				choice = scan.nextline();	
			}
			catch (NumberFormatException e) {
				System.out.print("Sorry, that wasn't a valid option. Enter 1,"
								+ " 2, or 3");
			}
			if (choice == 1){
				System.out.print("Which problem's prompt would you like to see?"
								+ " You can enter a number between 1 and"
								+ problems.size);
				try{
				choice = scan.nextline();	
				}
				catch (NumberFormatException e) {
					System.out.print("Sorry, that wasn't a valid option. Enter 1,"
									+ " 2, or 3");
				}

				// ask for problem they want to check the prompt for
				// make getPrompt() method
			}
			else if (choice == 2){
				
				// get the problem choice

				System.out.println("Would you like to see the prompt for this"
									+ " problem solver? (y/n)");
				while (!seePrompt){
					try {
						String str = scan.nextline();	
					}
					catch (NumberFormatException e) {
						System.out.print("Sorry, that wasn't a valid option. Enter"
									+ " y or n.");
					}
				}
				// need other variable problems[choice-1].startSolver(prompt);
			}
			else if (choice == 3) {
				running = false;
			}
			else {
				System.out.println("Sorry, that wasn't a valid option. Please enter a choice again.");
			}
		}
	}
}