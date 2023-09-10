package com.kn.if_else;
import java.util.Scanner;
public class Pass_Fail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchaced value ");
		int grade = scan.nextInt();;
		gradeCheck(grade);
		scan.close();
	}
	static void gradeCheck(int num) {
		if (num > 50) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}