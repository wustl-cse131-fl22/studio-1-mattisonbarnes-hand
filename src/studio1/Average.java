package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first value to be averaged");
		int n1 = input.nextInt();
		System.out.print("Enter second value to be averaged");
		int n2 = input.nextInt();
		System.out.print("the average is "+(n1+n2)/2.0);
	}

}
