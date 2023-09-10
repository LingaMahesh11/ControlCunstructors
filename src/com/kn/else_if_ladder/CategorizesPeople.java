package com.kn.else_if_ladder;
import java.util.Scanner;
public class CategorizesPeople {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int age = scan.nextInt();
		ageChecking(age);
		scan.close();
	}
	static void ageChecking(int age) {
		if(age > 0 && age <= 12) {
			System.out.println("Child");
		}
		else if(age >=13 && age <= 19) {
			System.out.println("Teen");
		}
		else if(age >=20 && age <= 59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}