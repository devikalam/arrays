package javaproblems;

import java.util.Scanner;

public class PerfectNO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num-1;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("perfect no");
		}
		else {
			System.out.println("not a perfect no");
		}

	}

}
