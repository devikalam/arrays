package javaproblems;

import java.util.Scanner;

public class LastCol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number----");
		int num = sc.nextInt();
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=num;col++) {
				if(col==num) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
