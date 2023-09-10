package com.kn.for_loops;
import java.util.Scanner;
public class SumofNNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int N = scan.nextInt();
		int result = 0;
		for (int i = 1;i <= N;i++) {
			result += i; 
			
		}
		System.out.println("Sum of Natural numbers is " + result);
		scan.close();
			
	}

}
