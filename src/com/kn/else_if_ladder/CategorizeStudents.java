package com.kn.else_if_ladder;
import java.util.Scanner;
public class CategorizeStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int marks = scan.nextInt();
		ageChecking(marks);
		scan.close();
	}
	static void ageChecking(int marks) {
		if(marks >= 90 && marks <= 100) {
			System.out.println("A Grade");
		}
		else if(marks >=80 && marks <= 89) {
			System.out.println("B Grade");
		}
		else if(marks >=70 && marks <= 79) {
			System.out.println("C Grade");
		}
		else if(marks >=60 && marks <= 69) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("F Grade");
		}
	}

}