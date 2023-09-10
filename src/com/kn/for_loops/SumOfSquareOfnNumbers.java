package com.kn.for_loops;
import java.util.Scanner;
public class SumOfSquareOfnNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		
		sumOfSquareOfNumbers(num);
		scan.close();
	}
	static void sumOfSquareOfNumbers(int num) {
		int result = 0;
		for(int i = 1;i <= num;i++) {
			result = result +(i*i);
			
		}
		System.out.print("The Sum of Square of Numbers is ");
		System.out.println(result);
	}
}