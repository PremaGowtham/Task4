package Task4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for a:");
		int a = scan.nextInt();
		
		System.out.println("Enter value for b:");
		int b = scan.nextInt();
		
		System.out.println("Enter value for c:");
		int c = scan.nextInt();
		
		System.out.println("Enter value for d:");
		int d = scan.nextInt();
		
		int sumAB = a+b;
		int sumCD = c+d;
		
		if (sumAB > sumCD) {
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}else {
			System.out.println("The sum of a and b is not greater than the sum of c and d");
			
		}
		
		
		
		
		

	}

}
