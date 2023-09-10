package com.kn.for_loops;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter first Number ");
		int num1 = scan.nextInt();
		System.out.print("Enter second Number ");
		int num2 = scan.nextInt();
		
		int result = gcd(num1,num2);
		System.out.println(result);
		scan.close();
		
	}
	static int gcd(int num1 , int num2) {
		int gcd = 1;
		for(int i = 1;i <= num1 && i <= num2;i++) {
			if (num1%i == 0 && num2%i == 0) {
				gcd = i;
				
			}
		
		}
		return gcd;
		
	}

}
