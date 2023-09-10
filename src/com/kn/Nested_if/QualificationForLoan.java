package com.kn.Nested_if;
import java.util.Scanner;
public class QualificationForLoan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		System.out.println("Enter your income ");
		int income = scan.nextInt();
		ageIncomeCheck(age,income);
		scan.close();
	}
	static void ageIncomeCheck(int age,int income) {
		if (age > 21) {
			if (income > 400000) {
				System.out.println("You are eligible for the LOAN");
			}
			else {
				System.out.println("You are not eligible for the LOAN");
			}
		}
		else {
			System.out.println("You are not eligible for the LOAN");
		}
	}

}
