package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year.");
		int year = input.nextInt();
		boolean LeapYear = (year%4==0) && (year%100!=0) || (year%400==0);
		System.out.print(LeapYear);
	}

}
