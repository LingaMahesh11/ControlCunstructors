package com.kn.for_loops;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int N = scan.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		//System.out.print(firstNum + " ");
		//System.out.print(secondNum + " ");
		for (int i = 0;i < N;i++) {
			System.out.print(firstNum + " ");
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
		scan.close();
	}

}
