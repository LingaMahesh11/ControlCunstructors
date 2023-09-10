package com.kn.for_loops;
import java.util.Scanner;
public class NmberTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int N = scan.nextInt();
		System.out.println("The Table is ");
		for(int i = 1;i<=N;i++) {
			System.out.println(N + " " + "X" + " " + i + " " + "=" + " " + N*i);
		}
		scan.close();
	}

}
