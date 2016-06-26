// Write a simple Java program to check whether a given number is a prime number or not.
// Using Classes, Object and methods of class

package Class3_assignments;

import java.util.Scanner;

public class class3_assignment2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan_in.nextInt();
		
		class3_assignment2_prime_number pn = new class3_assignment2_prime_number(num);
		
		if (pn.check_prime())
			System.out.println(num + " is prime.");
		else 
			System.out.println(num + " is composite.");
		
		if (scan_in != null)
			scan_in.close();
		
	}

}
