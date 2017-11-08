/**
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
* get 3, 5, 6 and 9. The sum of these multiples is 23.
*
* Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class ProblemOne {
	
	public static void main(String[] args){
		
		
		
	}
	
}


PSEUDO:

list numbers = userInput1;
int upperLimit = userInput2;
list multiples
int x = upperLimit - 1; 
int y = 0; // used to iterate through numbers

for (x; x > 0;){

	while (x % numbers[y] != 0 & y < numbers.length)
		y++;
	if (y == numbers.length)
		x--;
	else 
		multiples.add(x);



}