package com.kn.for_loops;
import java.util.Scanner;
public class PowerOfNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter base ");
		int base = scan.nextInt();
		System.out.println("Enter exponent ");
		int exponent = scan.nextInt();
		
		int calculatePower = calculatePower(base,exponent);
		System.out.println("Power value of the given value is " + calculatePower);
		scan.close();
	}
	
	static int calculatePower(int base,int exponent) {
		int result = 1;
		for (int i = 1;i<=exponent;i++) {
			result = result * base;
		}
		return result;
	}
}