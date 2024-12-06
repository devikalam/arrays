package javaproblems;

public class PrimeDigit {

	public static void main(String[] args) {
		int n=5976;
		while(n>0) {
			int rem=n%10;
			int count=0;
			for(int i=1;i<=rem;i++) {
				if(rem%i==0) {	
					count++;
				}
			}


			if(count==2) {

				System.out.println(rem);

			}
			n=n/10;
		}
	}}
