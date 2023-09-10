package com.kn.for_loops;
import java.util.Scanner;
public class AllEvenNumbersBetween1AndN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		int a = evenNumbers(num);
		System.out.println(a);
		scan.close();
		}
	static int evenNumbers(int num) {
		int result = 1;
		for (int i = 1;i%2==0;i++) {
			result = i%2;
		}
		return result;
	}
}