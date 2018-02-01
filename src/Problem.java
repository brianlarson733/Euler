/**
*
*/

abstract class Problem {

	//they should all have String prompt instance variable that they override...but actually this breaks things. So no. But then what? 
	//printPrompt should be spelled out here.
	//startSolver should call printPrompt and then call problemSolver
	//no subclass overrides startSolver
	//all subclasses override problemSolver

	private String prompt = "";

	public Problem(String prompt){
		this.prompt = prompt;
	}

	public void printPrompt(){
		System.out.println("Here is the prompt:");
		System.out.println(prompt);
	}

	public void startSolver(boolean displayPrompt){
		if (displayPrompt) {
			printPrompt();
		}

		System.out.println("Let's get started.");
		solver();
	}

	abstract public void solver();

}