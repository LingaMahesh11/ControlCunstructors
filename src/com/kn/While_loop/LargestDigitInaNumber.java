package com.kn.While_loop;
import java.util.Scanner;
public class LargestDigitInaNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		
		int result = largestDigit(num);
		System.out.println("The largest digit int the " +num + " is "+result);
		scan.close();
		
	}
	public static int largestDigit(int n) {
		int largest = 0;
		
		while(n>0) {
			int r = n%10;
			if(r>largest) {
				largest = r;
			}
			n=n/10;
		}
		return largest;
	}

}
