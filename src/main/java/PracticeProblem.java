/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Owais Ali Khan
	* Date Created: Feb 23, 2026
	* Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner; 
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		char letter = input.next().charAt(0);
		System.out.print("Input another lowercase letter: ");
		char letter1 = input.next().charAt(0);
		System.out.println(letter < letter1);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num >= 0 && num <= 10 );
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num > 0 && num != 5);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.println(!word.equals("banana"));

	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print( "Enter an integer: ");
		int num = input.nextInt();
		System.out.println("The integer " + num + " is " + (num%2==0));
	}

}
