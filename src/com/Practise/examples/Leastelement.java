package com.Practise.examples;

import java.util.Scanner;

public class Leastelement {
	public static void main(String[] args) {
		int least, size, i;
		String ch;
		// int arr[] = new int[50];
		String[] arr = new String[]{"5","3","2"};
		
		
		String result = task(arr);
		String expected = "3";
		test(result, expected);
	}

	/*private static String task(String string) {
		// TODO Auto-generated method stub
		return null;
	}*/

	private static void test(String result, String expected) {

		if (result.equals(expected)) {
			System.out.println("test pass");
		} else {
			System.out.println("test fails");
		}

	}

	private static String task(String[] arr) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * do { System.out.println("enter size"); size = scan.nextInt(); for (i = 1; i
		 * <= size; i++) { System.out.println("enter elements to sort "); arr[i] =
		 * scan.nextInt();
		 * 
		 * }
		 */

		// System.out.println("searching for least element ...");
		String least = arr[1];

		for (int i = 1; i <= arr.length; i++) {
			if (least > arr[i]) {

				least = arr[i];
			}

		}
		/*
		 * System.out.println("least element in array is:" + least);
		 * 
		 * System.out.println("do you want to enter more elements(y/n)");
		 * 
		 * ch = scan.next();
		 * 
		 * }
		 * 
		 * } while (ch == "y");
		 * 
		 * 
		 * scan.close();
		 */
	}
}
