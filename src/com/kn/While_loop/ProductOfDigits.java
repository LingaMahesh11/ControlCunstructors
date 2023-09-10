package com.kn.While_loop;
import java.util.Scanner;
public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		digitsProduct(num);
		scan.close();
	}
	static void digitsProduct(int num) {
		int result = 1;
		while (num > 0) {
			int r = num%10;
			result = result * r;
			num = num/10;
		}
		System.out.println(result);
	}

}
