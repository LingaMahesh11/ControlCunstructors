package com.kn.for_loops;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		int temp = num;
		int result = 0;
		while (num > 0) {
			int r = num % 10;
			result = result*10 + r;
			num = num/10;
		}
		if (temp == result) {
			System.out.println("Yes it is a Palindrome Number");
		}
		else {
			System.out.println("No, it is not a Palindrome Number");
		}
		scan.close();
	}
	

}
