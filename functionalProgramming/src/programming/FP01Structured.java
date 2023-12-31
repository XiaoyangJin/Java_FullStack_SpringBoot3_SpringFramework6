package programming;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,8,3,5,7));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//how to loop the numbers
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
