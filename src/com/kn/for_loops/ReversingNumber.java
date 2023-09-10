package com.kn.for_loops;
import java.util.Scanner;
public class ReversingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		int numberReversing = numberReversing(num);
		System.out.println(numberReversing);
		scan.close();
		
	}
	static int numberReversing(int num) {
		int result = 0;
		for (;num>0;) {
			int r = num % 10;
			result = result*10 + r;
			num = num / 10;
		}
		return result;
	}

}