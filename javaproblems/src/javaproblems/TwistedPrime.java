package javaproblems;

public class TwistedPrime {

	public static void main(String[] args) {
	int n=23,c1=0,temp=n;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			c1++;
		}}
		if(c1==2) {
			//print reverse no
			int rev=0;
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println("rev no is" + rev);
		
			// check rev num is prime 
			int c2=0;
			for(int i=1;i<=rev;i++) {
			if(rev%i==0) {
				c2++;
			}}
			if(c2==2) {
				System.out.println(temp + " is twisted prime");
			}
			else {
				System.out.println(temp+" is not a twisted prime");
			}}
			else {
				System.out.println("given no is not a prime");
			}
			
			
			
		}

	
	

}
