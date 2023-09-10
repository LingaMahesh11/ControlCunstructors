package com.kn.simple_if;
import java.util.Scanner;
public class AdultCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int i = scan.nextInt();
		boolean adultCheck = adultCheck(i);
		if (adultCheck) {
			System.out.println("You are eligible ");
		}
		else {
			System.out.println("You are not eligible ");
		}
		scan.close();
	}
	
	public static boolean adultCheck(int i) {
		if (i > 21) {
			return true;
		}
		else {
			return false;
		}
	}

}
