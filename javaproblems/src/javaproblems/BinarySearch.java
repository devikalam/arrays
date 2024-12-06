package javaproblems;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {1,23,12,5,7};
		Arrays.sort(a);
		int l=0,r=a.length-1;
		int ele=9;boolean flag=false;
		while(l<=r) {
			int mid=(l+r)/2;
			System.out.println(mid);
			if(ele==a[mid]) {
				flag=true;
				System.out.println("ele found");
				break;
			}
			else if(ele>a[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		if(flag==false) {
			System.out.println("ele not found");
		}

	}

	
}
