package com.kn.simple_if;
import java.util.Scanner;
public class  PositiveNumber{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		boolean flag = isPositiveNumber(num);
		if (flag) {
			System.out.println("It is a positive Number");
		}
		else {
			System.out.println("It is a Negative Number");
		}
		scan.close();
		
		
	}
	
	static boolean isPositiveNumber(int num) {
		if (num > 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
