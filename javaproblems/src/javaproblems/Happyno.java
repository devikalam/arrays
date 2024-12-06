package javaproblems;

public class Happyno {

	public static void main(String[] args) {
		int n=23;
		while(true) {
		int sum=0;
		while(n>0) {
		int rem=n%10;
		int sq=rem*rem;
		sum=sum+sq;
         n=n/10;
	}
		System.out.println(sum);
		if(sum==1) {
			System.out.println("happyno");
			break;
		}
		else if(sum==4) {
			System.out.println("sad no");
			break;
		}
		else {
			n=sum;
		}}

}
		}
