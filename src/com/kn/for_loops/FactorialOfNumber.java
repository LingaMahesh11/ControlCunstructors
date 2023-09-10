package com.kn.for_loops;
import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int N = scan.nextInt();
		int result = 1;
		for (int i = 1;i<=N;i++) {
			result = result * i;
		}
		System.out.println("factorial Value is " + result);
		scan.close();
	}

}
