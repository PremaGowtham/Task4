package Task4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value");
		int number = scan.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("The number" + number + "is even");
		}
		else {
			System.out.println("The number" + number + "is odd");
		}
	}

}
