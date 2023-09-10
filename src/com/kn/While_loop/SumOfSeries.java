package com.kn.While_loop;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		double result = seriesSum(num);
		System.out.println(result);
		scan.close();
	}
	static double seriesSum(double num) {
		double sum = 0.0;
		for (double i = 1;i <= num;i++) {
			sum = sum + 1/i;
		}
		return sum;
	}
}
