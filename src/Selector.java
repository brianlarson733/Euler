/**
* Object for choosing which option to activate.
*/

import java.util.*;

public class Selector {

	public void startSelector(){

		ProblemOne problemOne = new ProblemOne();
		ProblemTwo problemTwo = new ProblemTwo();
		Object[] problems = new Object[]{problemOne,problemTwo};
		Scanner scan = new Scanner(System.in);
		System.out.println("I have " + problems.size + "problems you can"
							+ " select. Here are your options to proceed:");
		boolean running = true;
		boolean prompt = false;
		int choice = 0;

		(while running){
			System.out.println("1) Review the prompt for a particular problem.");
			System.out.println("2) Start the solver program for a problem.");
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
				// ask for problem they want to check the prompt for
			}
			else if (choice == 2){
				
				// get the problem choice

				System.out.println("Would you like to see the prompt for this"
									+ " problem solver? (y/n)");
				while (!prompt){
					try {
						String str = scan.nextline();	
					}
					catch (NumberFormatException e) {
						System.out.print("Sorry, that wasn't a valid option. Enter"
									+ " y or n.");
					}
				}
				// need other variable problems[choice-1].startProblem(prompt);
			}
			else {
				running = false;
			}
		}
	}
}