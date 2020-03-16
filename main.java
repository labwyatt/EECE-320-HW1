package edu.manhattan;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the value of x: ");
			x = in.nextInt();
			System.out.println("Enter the value of y: ");
			y = in.nextInt();
			in.close();
			
			if(x%y == 0) {
				System.out.println(x + " is divisible by " + y);
			}
			else {
				System.out.println(x + " is not divisible by " + y);
			}
	}
}
