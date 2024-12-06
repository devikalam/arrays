package javaproblems;

public class AlternateNo {

	public static void main(String[] args) {
int n=2249,c=0,sum=0,s=0;
while(n>0) {
	int rem=n%10;
	if(rem%2==0) {
		sum=sum+rem;
	}
	else {
		s=s+rem;
	}
	n=n/10;

}
	System.out.println(sum);
	System.out.println(s);

	
	
	}

}
