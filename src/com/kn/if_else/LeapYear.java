package com.kn.if_else;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int year = scan.nextInt();
		boolean leapYear = leapYear(year);
		if (leapYear) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
		scan.close();
		
	}
	static boolean leapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		else if(year % 100 == 0 && year % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
