package edu.manhattan;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String letter;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter a-e: ");
		letter = in.next();
		in.close();
		char choice = ' ';
		choice = letter.charAt(0);
		
		switch(choice) {
		case 'a':
			System.out.println("You entered the letter a.");
			break;
		case 'b':
			System.out.println("You entered the letter b.");
			break;
		case 'c':
			System.out.println("You entered the letter c.");
			break;
		case 'd':
			System.out.println("You entered the letter d.");
			break;
		case 'e':
			System.out.println("You entered the letter e.");
			break;
			default:
				System.out.println("You didn't enter a valid letter.");
			
		}
		

	}

}
