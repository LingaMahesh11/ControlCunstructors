package com.kn.While_loop;
import java.util.Scanner;
public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		int length = digitLength(num);
		System.out.println(length);
		scan.close();
	}
	static int digitLength(int num) {
		int length = 0;
		while(num > 0) {
			length++;
			num = num / 10;
		}
		return length;
	}

}
