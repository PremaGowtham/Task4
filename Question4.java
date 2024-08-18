package Task4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		
		System.out.println("Before Swapping:");
		System.out.println("First number:" + num1);
		System.out.println("second number:" + num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("First number:" + num1);
		System.out.println("second number:" + num2);
		
		

	}

}
