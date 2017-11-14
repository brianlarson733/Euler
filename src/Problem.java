/**
*
*/

abstract class Problem {

	public void printPrompt(String prompt){
		System.out.println("Here is the prompt:");
		System.out.println(prompt);
	}

	abstract public void startSolver(boolean prompt);

}