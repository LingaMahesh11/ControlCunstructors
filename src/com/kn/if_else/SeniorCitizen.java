package com.kn.if_else;
import java.util.Scanner;
public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchaced value ");
		int age = scan.nextInt();;
		ageCheck(age);
		scan.close();
	}
	static void ageCheck(int age) {
		if (age > 60) {
			System.out.println("SENIOR CITIZEN");
		}
		else {
			System.out.println("NOT A SENIOR CITIZEN");
		}
	}

}