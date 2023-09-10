package com.kn.simple_if;
import java.util.Scanner;
public class ApplicableForVote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int i = scan.nextInt();
		boolean adultCheck = ageCheck(i);
		if (adultCheck) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting");
		}
		scan.close();
	}
	
	public static boolean ageCheck(int i) {
		if (i >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

}
