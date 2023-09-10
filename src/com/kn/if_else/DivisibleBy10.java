package com.kn.if_else;
import java.util.Scanner;
public class DivisibleBy10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchaced value ");
		int num = scan.nextInt();;
		number(num);
		scan.close();
	}
	static void number(int num) {
		if (num % 10 == 0) {
			System.out.println("Yes the Number your entered is divisible by 10");
		}
		else {
			System.out.println("No the Number your entered is not divisible by 10");
		}
	
	}

}