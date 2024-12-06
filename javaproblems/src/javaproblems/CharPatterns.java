package javaproblems;

import java.util.Scanner;

public class CharPatterns {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	char ch='A';
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			System.out.print(ch+" " );
		}
		ch++;
		System.out.println();
	}
	

	}

}
