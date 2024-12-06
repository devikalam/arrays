package javaproblems;

public class FirstLastDigitSUM {
	public static void main(String[] args) {
		int n=2356,last=n%10;n=n/10;
		int osum=0,isum=0;
		while(n>=10) {
			int rem=n%10;
			isum=isum+rem;
			n=n/10;
		}
		osum=n+last;
		if(osum==isum) {
			System.out.println("xylem");
		}
		else {
			System.out.println("phloem");
		}
	}

}
