package com.Practise.examples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("enter number to find factorial");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		scan.close();
		int factorial = fact(num);
		System.out.println("factorial is " + factorial);
		int result = fact(5);
		int expected = 120;
		test(result, expected);
	}

	private static void test(int result, int expected) {
		if (result == expected) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}


	private static int fact(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * fact(num - 1);
		}
		
	}
}
