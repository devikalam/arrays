package javaproblems;

import java.util.Arrays;

public class InsertEleInPartIndex {

	public static void main(String[] args) {
		int[]a= {10,20,30,50};
		int[]b=new int[a.length+1];
		int ele=40,index=3;
		if(index<=b.length) {
			int j=0;
			for(int i=0;i<b.length;i++) {
				if(i==index) {
					b[i]=ele;
				}
				else {
					b[i]=a[j];
					j++;
				}
			}
			System.out.println(Arrays.toString(b));
		}

	}

}
