package Task4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		int count = 0;

	    while (num != 0) {
	    
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);

	}

}
