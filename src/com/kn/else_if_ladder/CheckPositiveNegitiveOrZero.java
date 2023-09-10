package com.kn.else_if_ladder;
import java.util.Scanner;
public class CheckPositiveNegitiveOrZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		numberChecking(num);
		scan.close();
	}
	static void numberChecking(int num) {
		if(num > 0) {
			System.out.println("Positive Number");
		}
		else if(num <0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
	}

}