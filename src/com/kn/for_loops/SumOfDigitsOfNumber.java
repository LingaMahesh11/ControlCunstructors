package com.kn.for_loops;
import java.util.Scanner;
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		int digitsSum = digitsSum(num);
		System.out.println(digitsSum);
		scan.close();
	}
	static int digitsSum(int num) {
		int result = 0;
		for (;num > 0;) {
			int r = num % 10;
			result += r;
			num = num/10;
		}
		return result;
	}

}
