package com.kn.if_else;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchaced value ");
		int num = scan.nextInt();;
		numberCheck(num);
		scan.close();
	}
	static void numberCheck(int num) {
		if (num >= 0) {
			System.out.println("POSITIVE NUMBER");
		}
		else {
			System.out.println("NEGATIVE NUMBER");
		}
	}

}