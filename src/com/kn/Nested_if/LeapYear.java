package com.kn.Nested_if;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		leapYear(year);
		scan.close();
	}
	static void leapYear(int year) {
		if(year % 4 ==0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap year");
				}
			}
			else {
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
