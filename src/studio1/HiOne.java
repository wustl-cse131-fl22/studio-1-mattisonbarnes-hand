package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner object = new Scanner(System.in);
		System.out.println("Hi, Pat. How are you?");
		String name = object.nextLine();
		System.out.println("My name is" + name);
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
	}

}
