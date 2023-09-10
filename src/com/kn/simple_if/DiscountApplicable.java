package com.kn.simple_if;
import java.util.Scanner;
public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchaced value ");
		int num = scan.nextInt();;
		discountCheck(num);
		scan.close();
	}
	static void discountCheck(int num) {
		if (num > 100) {
			System.out.println("YOU ARE ELIGIBLE FOR DISCOUNT");
		}
		else {
			System.out.println("SORRY YOU ARE NOT ELIGIBLE FOR DISCOUNT");
		}
	}

}
