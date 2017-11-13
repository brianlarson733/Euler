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

		while ((toReturn < 0) | (toReturn != (int) toReturn)){
			System.out.println("Please enter a positive whole number.");			  
			placeholder = scanner.nextLine();
			try {
				toReturn = Integer.parseInt(placeholder);
			}
			catch (NumberFormatException e) {
				System.out.print("Sorry, that wasn't a whole number. ");
			}
		}
		return toReturn;
	}
}