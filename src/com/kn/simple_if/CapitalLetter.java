package com.kn.simple_if;
import java.util.Scanner;
public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your charecter");
		char c = scan.next().charAt(0);
		capitalLetterCheck(c);
		scan.close();
	}
	static void capitalLetterCheck(char c) {
		char a = Character.toUpperCase(c);
		if (c == a) {
			System.out.println("Capital letter");
		}
		else {
			System.out.println("Not a capital letter");
		}
	}

}
