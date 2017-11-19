import java.util.*;

public class Tools {

	public static int sumLinkedList(LinkedList<Integer> list) {
		int sum = 0;
		
		while (list.size() > 0){
			sum += list.poll();
		}
		return sum;
	}

	public static int getWholeNumberInput() {
		Scanner scanner = new Scanner(System.in);
		String placeholder = "";
		int toReturn = -1;

		while ((toReturn < 1) | (toReturn != (int) toReturn)){
			System.out.println("Please enter a positive whole number.");			  
			placeholder = scanner.nextLine();
			try {
				toReturn = Integer.parseInt(placeholder);
			}
			catch (NumberFormatException e) {}
		}
		return toReturn;
	}

	/*
	* It is assumed that choices is filled with whole numbers
	*/
	public static int getWholeNumberInput(int[] choices) {
		
		Scanner scanner = new Scanner(System.in);
		String placeholder = "";
		int toReturn = -1;

		while ((toReturn < 1) | (toReturn != (int) toReturn)){
			
			System.out.println("Please enter a number from the following"
								+ " choices: ");			  
			
			//print out the available choices from the int array
			int i = 0;
			for (; i < choices.length-1 ; i++){
				System.out.print(choices[i] + ", ");
			}
			System.out.println(choices[i] + "");
			
			//get user the user input and verify it is an int
			placeholder = scanner.nextLine();
			try {
				toReturn = Integer.parseInt(placeholder);
			}
			catch (NumberFormatException e) {}
			
			//check if user input is in choices, if not reject it
			if (Arrays.binarySearch(choices, toReturn) < 0){
				toReturn = -1;
			}
		}
		return toReturn;
	}

	/*
	* It is assumed that upperLimit is positive.
	*/
	public static int getWholeNumberInput(int upperLimit) {
		Scanner scanner = new Scanner(System.in);
		String placeholder = "";
		int toReturn = -1;

		while ((toReturn < 1) | (toReturn != (int) toReturn) | (toReturn > upperLimit)){
			System.out.println("Please enter a positive whole number between 1 and " + upperLimit);			  
			placeholder = scanner.nextLine();
			try {
				toReturn = Integer.parseInt(placeholder);
			}
			catch (NumberFormatException e) {}
		}
		return toReturn;
	}

	public static boolean getBooleanInput(){
		boolean toReturn = false;
		Scanner scanner = new Scanner(System.in);
		String placeholder = "";
		boolean running = true;

		while(running){
			System.out.println("Please enter yes or no. (y/n)");
		 	placeholder = scanner.nextLine();
		 	if (placeholder.length()==1){
			 	if (placeholder.charAt(0) == 'y'){
			 		toReturn = true;
			 		running = false;
		 		}
		 		else if (placeholder.charAt(0) == 'n') {
			 		running = false;
		 		} 
		 	} 	
		}
		return toReturn;
	}

	public static long getLongWholeNumberInput() {
		Scanner scanner = new Scanner(System.in);
		String placeholder = "";
		long toReturn = -1;

		while ((toReturn < 1) | (toReturn != (long) toReturn)){
			System.out.println("Please enter a positive whole number.");			  
			placeholder = scanner.nextLine();
			try {
				toReturn = Long.parseLong(placeholder);
			}
			catch (NumberFormatException e) {}
		}
		return toReturn;
	}

	public static long largestPrimeFactor(long number){
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