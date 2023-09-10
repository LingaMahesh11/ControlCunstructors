package com.kn.Nested_if;
import java.util.Scanner;
public class DrivingLicense {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		System.out.println("Enter your income ");
		int visionscore = scan.nextInt();
		ageIncomeCheck(age,visionscore);
		scan.close();
	}
	static void ageIncomeCheck(int age,int visionscore) {
		if (age > 19) {
			if (visionscore > 1) {
				System.out.println("You are eligible for the Driving License");
			}
			else {
				System.out.println("You are not eligible for the Driving License");
			}
		}
		else {
			System.out.println("You are not eligible for the Driving License");
		}
	}

}
