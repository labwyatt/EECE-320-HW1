package edu.manhattan;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double a = 0.0;
		double cost = 0.0;
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the value of the check: ");
			a = in.nextDouble();
			in.close();
		
			if(a<10) { 
			System.out.println("The charge is $1");
			} 
			else if (a >= 10) {
				cost = (a*.10);
				System.out.println("The charge is $" + cost);
			} else if (a >= 100) {
				cost = 5+(a*0.05);
				System.out.println("The charge is $" + cost);
			}else if (a>= 1000) {
				cost = 40 +(a*0.01);
				System.out.println("The charge is $" + cost);
			}	
		}
	}
