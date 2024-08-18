package Task4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
			 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=scan.nextInt();
		
		if(age>=60) {
			System.out.println("The Person is Senior Citizen");
		}
		else {
			System.out.println("The Person is not a Senior Citizen");
		}
	}

	}


