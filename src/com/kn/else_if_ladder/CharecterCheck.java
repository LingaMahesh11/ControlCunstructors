package com.kn.else_if_ladder;
import java.util.Scanner;
public class CharecterCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		char c = scan.next().charAt(0);
		characterChecking(c);
		scan.close();
	}
	static void characterChecking(char c) {
		if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
			System.out.println("Vowel");
		}
		else if((int)c < 0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
	}

}